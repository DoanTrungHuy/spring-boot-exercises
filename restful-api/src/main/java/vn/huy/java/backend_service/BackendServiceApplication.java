package vn.huy.java.backend_service;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class BackendServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendServiceApplication.class, args);
	}
}
