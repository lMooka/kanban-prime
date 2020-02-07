package br.com.mooka.kanbanprime.domain.repository;

import br.com.mooka.kanbanprime.domain.orm.KanbanCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KanbanCardRepository extends CrudRepository<KanbanCard, Integer> {
}
