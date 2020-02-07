package br.com.mooka.kanbanprime.api.kanban;

import br.com.mooka.kanbanprime.domain.orm.KanbanCard;
import br.com.mooka.kanbanprime.service.KanbanCardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/kanban/card")
public class KanbanCardController extends CrudController<KanbanCard, KanbanCardService, Integer> {
    public KanbanCardController(KanbanCardService service) {
        super(service);
    }
}
