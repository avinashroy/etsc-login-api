package com.codegrind.etsclogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.codegrind.repository")
@EntityScan("com.codegrind.model")
@ComponentScan("com.codegrind")
public class EtscLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtscLoginApplication.class, args);
	}

}
