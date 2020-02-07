package br.com.mooka.kanbanprime.domain.orm;

import br.com.mooka.kanbanprime.service.IEntityId;
import lombok.*;

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
@Table(name = "kanban_board")
public class KanbanBoard implements IEntityId<Integer> {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardId;
    private String title;
    private String description;

    @OneToMany
    @JoinColumn(name = "board_id")
    private List<KanbanColumn> columns;

    @Override
    public Integer getEntityId() {
        return 0;
    }
}
