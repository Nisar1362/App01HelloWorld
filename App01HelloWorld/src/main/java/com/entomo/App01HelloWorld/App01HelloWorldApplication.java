package com.entomo.App01HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(@Configuration + @EnableAutoConfiguration + @ComponentScan)
public class App01HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(App01HelloWorldApplication.class, args);
	}

}
