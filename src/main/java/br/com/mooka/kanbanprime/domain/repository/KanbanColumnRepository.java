package br.com.mooka.kanbanprime.domain.repository;

import br.com.mooka.kanbanprime.domain.orm.KanbanColumn;
import org.springframework.data.repository.CrudRepository;

public interface KanbanColumnRepository extends CrudRepository<KanbanColumn, Integer> {
}
