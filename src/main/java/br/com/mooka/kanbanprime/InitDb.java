package br.com.mooka.kanbanprime;

import br.com.mooka.kanbanprime.domain.orm.KanbanCard;
import br.com.mooka.kanbanprime.domain.orm.KanbanColumn;
import br.com.mooka.kanbanprime.domain.repository.KanbanCardRepository;
import br.com.mooka.kanbanprime.domain.repository.KanbanColumnRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InitDb implements CommandLineRunner {

    @Autowired
    private KanbanCardRepository kanbanCardRepository;
    @Autowired
    private KanbanColumnRepository kanbanColumnRepository;

    @Override
    public void run(String... strings) throws Exception {
        kanbanColumnRepository.save(
                new KanbanColumn("homologa")
        );

        kanbanCardRepository.save(
                //new KanbanCardEntity()
                new KanbanCard("the hue name", "the hue content", "the hue version", "the hue priority")
        );
    }
}
