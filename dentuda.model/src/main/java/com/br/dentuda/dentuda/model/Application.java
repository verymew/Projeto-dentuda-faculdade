package com.br.dentuda.dentuda.model;

import com.br.dentuda.dentuda.model.Idao.IConsultasDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private IConsultasDao test;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
