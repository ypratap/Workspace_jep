package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Autowired
	RestTemplate restTemplate;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@RequestMapping(value = "/Object/getList/", method = RequestMethod.GET)
	public @ResponseBody List<Object> findAllObjects() {

		List<Object> objects = new ArrayList<Object>();
		return objects;
	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Payload payload = restTemplate.getForObject("https://quoters.apps.pcfone.io/api", Payload.class);
//			log.info(payload.toString());
//		};
//	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		ResponseEntity<Payload> responseEntity = restTemplate.getForEntity("https://quoters.apps.pcfone.io/api",
				Payload.class);
		return args -> {
			Payload payload = responseEntity.getBody();
			MediaType contentType = responseEntity.getHeaders().getContentType();
			HttpStatus statusCode = responseEntity.getStatusCode();
			log.info(payload.toString());
			log.info(contentType.toString());

			log.info(statusCode.toString());

		};
	}
}