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
		
		OrdersLogic.setPaymentsServiceUrl("http://localhost:8080");
		OrdersLogic.setShippingServiceUrl("http://localhost:8081");
		OrdersLogic.setProductsServiceUrl("http://localhost:8082");

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
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
