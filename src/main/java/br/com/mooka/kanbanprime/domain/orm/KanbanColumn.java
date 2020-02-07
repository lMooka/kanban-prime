package br.com.mooka.kanbanprime.domain.orm;

import br.com.mooka.kanbanprime.service.IEntityId;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "kanban_column")
public class KanbanColumn implements IEntityId<Integer> {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int columnId;
    private String title;
    private String description;

    @OneToMany
    @JoinColumn(name = "column_id")
    private List<KanbanCard> kanbanCards;

    @ManyToOne
    @JoinColumn(name = "board_id")
    @JsonIgnore
    private KanbanBoard kanbanBoard;

    public KanbanColumn(String title) {
        this.title = title;
    }

    @Override
    public Integer getEntityId() {
        return columnId;
    }
}
