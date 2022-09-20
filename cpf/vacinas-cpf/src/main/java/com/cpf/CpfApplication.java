package com.cpf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cpf.service.CpfService;
@SpringBootApplication
public class CpfApplication {

	@Autowired
	static
	CpfService cpf;
	public static void main(String[] args) {
		SpringApplication.run(CpfApplication.class, args);
		System.out.println("Ok!");
	}
}
