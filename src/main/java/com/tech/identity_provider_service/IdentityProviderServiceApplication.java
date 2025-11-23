package com.tech.identity_provider_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class IdentityProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentityProviderServiceApplication.class, args);
		System.out.println("Hello World");
	}

}
