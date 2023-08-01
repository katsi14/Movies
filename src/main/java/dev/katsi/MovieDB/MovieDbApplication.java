package dev.katsi.MovieDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MovieDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDbApplication.class, args);
	}

}


