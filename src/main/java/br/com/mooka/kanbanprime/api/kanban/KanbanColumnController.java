package br.com.mooka.kanbanprime.api.kanban;

import br.com.mooka.kanbanprime.domain.orm.KanbanColumn;
import br.com.mooka.kanbanprime.service.KanbanColumnService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/kanban/column")
public class KanbanColumnController extends CrudController<KanbanColumn, KanbanColumnService, Integer>{
    public KanbanColumnController(KanbanColumnService service) {
        super(service);
    }
}
