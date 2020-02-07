package br.com.mooka.kanbanprime.domain.orm;

import br.com.mooka.kanbanprime.service.IEntityId;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Getter
@Setter
@Data
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
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String version;
    @Column
    private String priority;

    @ManyToOne
    @JoinColumn(name = "column_id")
    @JsonIgnore
    private KanbanColumn kanbanColumn;

    public KanbanCard(String title, String content, String version, String priority) {
        this.title = title;
        this.content = content;
        this.version = version;
        this.priority = priority;
    }

    @Override
    public Integer getEntityId() {
        return cardId;
    }
}
