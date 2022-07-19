package com.travelapp.backend.config;


import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableWebSecurity // Enable Spring Security’s web 
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // http.authorizeRequests().antMatchers("/*","swagger-ui.html").permitAll();
        http.authorizeRequests()
        .antMatchers("/", "/v2/api-docs", "/swagger-resources/**", "/webjars/**", "/swagger-ui.html").permitAll();

        http.csrf().disable()
            .authorizeRequests(
                    expressionInterceptUrlRegistry -> expressionInterceptUrlRegistry
                    .anyRequest()
                    .authenticated()
            ).oauth2ResourceServer()
            .jwt();
            
        http.cors();

        return http.build();
    }
    
  @Bean
  CorsConfigurationSource corsConfigurationSource() 
  {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Arrays.asList("*"));
    configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
  }
}