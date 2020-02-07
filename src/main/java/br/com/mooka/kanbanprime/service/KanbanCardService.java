package br.com.mooka.kanbanprime.service;

import br.com.mooka.kanbanprime.domain.orm.KanbanCard;
import br.com.mooka.kanbanprime.domain.repository.KanbanCardRepository;
import org.springframework.stereotype.Service;

@Service
public class KanbanCardService extends CrudServiceImpl<KanbanCardRepository, KanbanCard, Integer> {
    public KanbanCardService(KanbanCardRepository repository) {
        super(repository);
    }
}
