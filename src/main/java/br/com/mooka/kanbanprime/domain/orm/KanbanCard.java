package br.com.mooka.kanbanprime.domain.orm;

import br.com.mooka.kanbanprime.service.IEntityId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "kanban_card")
public class KanbanCard implements IEntityId<Integer> {
    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;
    private String title;
    private String content;
    private String version;
    private String priority;

    @ManyToOne
    @JoinColumn(name = "column_id")
    @JsonIgnore
    private KanbanColumn kanbanColumn;

    @Override
    @JsonIgnore
    public Integer getEntityId() {
        return cardId;
    }
}
