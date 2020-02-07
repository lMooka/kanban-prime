package br.com.mooka.kanbanprime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ComponentScan(basePackageClasses=KanbanRest.class)
public class KanbanPrimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KanbanPrimeApplication.class, args);
	}
}
