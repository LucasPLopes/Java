package br.com.devdojo.essentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.devdojo.essentials.utils.PasswordEncoder;

import br.com.devdojo.essentials.utils.PasswordEncoder;

@SpringBootApplication
public class EssentialsApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(EssentialsApplication.class, args);

		System.out.println("encode('password': " + PasswordEncoder.encode("password"));
	}

}
