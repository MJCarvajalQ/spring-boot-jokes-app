package guru.springframework.spring_boot_jokes_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controllers", "services"})
public class SpringBootJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJokesAppApplication.class, args);
	}

}
