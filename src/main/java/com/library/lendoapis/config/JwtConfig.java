package com.library.lendoapis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

@Configuration
public class JwtConfig {

    // Define a base64-encoded secret key for local testing
    private static final String SECRET_KEY = "N2Y1OGY2MzY2Y2MwOTAzZGY1OGE3Y2FjODcwZTFiNzA=";

    @Bean
    public JwtDecoder jwtDecoder() {
        // Convert the base64-encoded secret key into a SecretKey object for decoding JWTs
        byte[] keyBytes = Base64.getDecoder().decode(SECRET_KEY);
        SecretKey secretKey = new SecretKeySpec(keyBytes, "HmacSHA256");

        // Return the configured NimbusJwtDecoder with the secret key
        return NimbusJwtDecoder.withSecretKey(secretKey).build();
    }
}
