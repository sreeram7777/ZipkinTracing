package com.example.ZipkinClient1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import feign.Capability;
import feign.Feign;
import feign.micrometer.MicrometerCapability;
import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class ConfigClass {

	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.httpBasic(Customizer.withDefaults());
		http.authorizeHttpRequests(customizer->customizer.anyRequest().authenticated());
		return http.build();
	}
	
	@Bean
	public Feign.Builder builder()
	{
		return Feign.builder();
	}
	
	@Bean
	public Capability capability(final MeterRegistry registry)
	{
		return new MicrometerCapability(registry);
	}
	
}
