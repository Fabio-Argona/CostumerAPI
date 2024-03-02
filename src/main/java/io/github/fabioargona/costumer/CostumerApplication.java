package io.github.fabioargona.costumer;

import io.github.fabioargona.costumer.model.entity.Costumer;
import io.github.fabioargona.costumer.model.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CostumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerApplication.class, args);
	}

}
