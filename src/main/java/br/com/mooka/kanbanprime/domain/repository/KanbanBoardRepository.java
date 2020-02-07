package br.com.mooka.kanbanprime.domain.repository;

import br.com.mooka.kanbanprime.domain.orm.KanbanBoard;
import org.springframework.data.repository.CrudRepository;

public interface KanbanBoardRepository extends CrudRepository<KanbanBoard, Integer> {
}
