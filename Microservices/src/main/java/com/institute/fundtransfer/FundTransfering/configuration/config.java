package com.institute.fundstransfer.FundTransfering.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.institute.fundstransfer.FundTransferingService.FallBack;
import feign.Feign;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import io.github.resilience4j.ratelimiter.RateLimiter;

@Configuration
public class config {
    @Autowired
	private CircuitBreaker circuit;
	
	@Autowired
	private MyForexFallBack forex; 
	
	@Bean
	@Scope("Prototype")
	public Feign.Builder feignBuilder(){
		
		CircuitBreaker circuitBreaker =  CircuitBreaker.ofDefaults("forex-service");
	RateLimiter limit =  RateLimiter.ofDefaults("forex-service");
	FeignDecorators deco =  FeignDecorators.builder()
			.withRateLimiter(Limit)
			.withCircuitBreaker(circuitBreaker)
			.withFallback(forex)
			.build();
	
	return Resilience4jFeign.builder(deco);

}
}
