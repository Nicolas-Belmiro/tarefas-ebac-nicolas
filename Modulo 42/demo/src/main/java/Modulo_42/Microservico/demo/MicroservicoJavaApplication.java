package Modulo_42.Microservico.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicoJavaApplication.class, args);
	}

}
