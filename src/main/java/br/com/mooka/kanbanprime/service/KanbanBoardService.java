package br.com.mooka.kanbanprime.service;

import br.com.mooka.kanbanprime.domain.orm.KanbanBoard;
import br.com.mooka.kanbanprime.domain.repository.KanbanBoardRepository;
import org.springframework.stereotype.Service;

@Service
public class KanbanBoardService extends CrudServiceImpl<KanbanBoardRepository, KanbanBoard, Integer> {
    public KanbanBoardService(KanbanBoardRepository repository) {
        super(repository);
    }
}
