package uy.edu.ort.devops.ordersserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import uy.edu.ort.devops.ordersserviceexample.logic.OrdersLogic;

@SpringBootApplication
public class OrdersServiceExampleApplication {

	public static void main(String[] args) {
		
		OrdersLogic.setPaymentsServiceUrl("http://localhost:8081");
		OrdersLogic.setShippingServiceUrl("http://localhost:8082");
		OrdersLogic.setProductsServiceUrl("http://localhost:8080");

		SpringApplication.run(OrdersServiceExampleApplication.class, args);
		
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
		System.out.println("Testing Sonar");
	}
	
	public int sonarFailure(){
		int a = 10;
		int b = 50;
		if (b<a){
			b++;
			return a;
		}
		return a;
	}
	

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
