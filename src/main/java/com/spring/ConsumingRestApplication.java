package com.spring;

import com.spring.entities.News;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class ConsumingRestApplication {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


    @Bean
    public CommandLineRunner run(RestTemplate restTemplate)  {
        return args -> {
            String finnhubAPIUrl = "https://finnhub.io/api/v1/news?category=general";
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-Finnhub-Token", "c9beukqad3i8r0u3vdkg");
            headers.set("Content-Type","application/json");
            //Create a new HttpEntity
            final HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<News[]> response=restTemplate.exchange(finnhubAPIUrl, HttpMethod.GET, entity,News[].class);
            log.info("**************************************");
            log.info("Status: "+response.getStatusCode());
            log.info("**************************************");
            News[] news = response.getBody();
            if (news!=null)
                Arrays.stream(news).map(item -> "Hello: " + item.toString()).forEach(log::info);
        };
    }
}


