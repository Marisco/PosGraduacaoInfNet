package br.edu.infnet.appreciclavel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppreciclavelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppreciclavelApplication.class, args);
	}

}
