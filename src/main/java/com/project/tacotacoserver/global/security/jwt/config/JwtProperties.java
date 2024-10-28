package com.project.tacotacoserver.global.security.jwt.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "application.jwt")
public class JwtProperties {

    private String secretKey;
    private long expiration;
    private long refreshExpiration;

}