package br.com.mooka.kanbanprime.service;

import br.com.mooka.framework.crudapi.CrudServiceImpl;
import br.com.mooka.kanbanprime.domain.orm.KanbanColumn;
import br.com.mooka.kanbanprime.domain.repository.KanbanColumnRepository;
import org.springframework.stereotype.Service;

@Service
public class KanbanColumnService extends CrudServiceImpl<KanbanColumnRepository, KanbanColumn, Integer> {
    public KanbanColumnService(KanbanColumnRepository repository) {
        super(repository);
    }
}
