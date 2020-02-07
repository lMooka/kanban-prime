package br.com.mooka.kanbanprime.api.kanban;

import br.com.mooka.kanbanprime.domain.orm.KanbanBoard;
import br.com.mooka.kanbanprime.service.KanbanBoardService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/kanban/board")
public class KanbanBoardController extends CrudController<KanbanBoard, KanbanBoardService, Integer> {
    public KanbanBoardController(KanbanBoardService service) {
        super(service);
    }
}
