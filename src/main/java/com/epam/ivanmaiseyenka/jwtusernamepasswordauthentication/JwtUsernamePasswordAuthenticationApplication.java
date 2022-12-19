package com.epam.ivanmaiseyenka.jwtusernamepasswordauthentication;

import com.epam.ivanmaiseyenka.jwtusernamepasswordauthentication.model.RsaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaProperties.class)
public class JwtUsernamePasswordAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtUsernamePasswordAuthenticationApplication.class, args);
	}

}
