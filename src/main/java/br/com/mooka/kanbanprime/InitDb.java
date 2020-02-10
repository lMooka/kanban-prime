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
        var column = KanbanColumn.builder().title("title").description("description").build();

        kanbanColumnRepository.save(
                column
        );

        kanbanCardRepository.save(
                //new KanbanCardEntity()
                KanbanCard.builder().title("title").content("content").priority("0").version("1").column(column).build()
        );
    }
}
