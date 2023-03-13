package pl.oro.zad_1;

import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@NoArgsConstructor
@RequestMapping("api/v1/categories")
public class Zad1Application {

	public static void main(String[] args) {
		SpringApplication.run(Zad1Application.class, args);
	}

}
