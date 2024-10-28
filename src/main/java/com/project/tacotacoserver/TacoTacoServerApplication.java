package com.project.tacotacoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TacoTacoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoTacoServerApplication.class, args);
    }

}
