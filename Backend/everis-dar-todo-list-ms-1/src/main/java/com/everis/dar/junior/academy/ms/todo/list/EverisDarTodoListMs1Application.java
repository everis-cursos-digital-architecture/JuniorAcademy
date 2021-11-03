package com.everis.dar.junior.academy.ms.todo.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Main class that runs our Spring application.
 * @author everis
 *
 */
@SpringBootApplication
//@EnableSwagger2
public class EverisDarTodoListMs1Application {

	/**
	 * Main application method. Everything starts here.
	 * @param args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(
				EverisDarTodoListMs1Application.class, args);
	}

}
