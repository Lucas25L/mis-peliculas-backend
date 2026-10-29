package com.mis.peliculas.favoritas.pelis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PelisApplication {

	public static void main(String[] args) {
		SpringApplication.run(PelisApplication.class, args);
	}

}
