package id.polinema.acessor.managementacessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ManagementAcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementAcessorApplication.class, args);
	}

}
