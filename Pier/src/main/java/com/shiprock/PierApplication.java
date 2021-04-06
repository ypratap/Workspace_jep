package com.shiprock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.shiprock.Entity.CvsStore;

@SpringBootApplication
public class PierApplication {
	private static final Logger log = LoggerFactory.getLogger(PierApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PierApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			CvsStore quote = restTemplate.getForObject(
				//	"https://quoters.apps.pcfone.io/api/random", CvsStore.class);
					"https://www.cvs.com/immunizations/covid-19-vaccine/immunizations/covid-19-vaccine.vaccine-status.NJ.json?vaccineinfo", CvsStore.class);
			log.info(quote.toString());
		};
	}

}
