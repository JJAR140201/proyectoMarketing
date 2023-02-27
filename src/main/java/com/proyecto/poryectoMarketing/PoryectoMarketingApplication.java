package com.proyecto.poryectoMarketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PoryectoMarketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoryectoMarketingApplication.class, args);
	}

}
