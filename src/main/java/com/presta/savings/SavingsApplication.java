package com.presta.savings;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title = "Savings API documentation",
				description = "API documentation for Spring Boot savings system",
				version ="v1.0",
				contact = @Contact(
						name = "Triza chebet",
						email="trizahchebet8@gmail.com",
						url = "https://github.com/Trizachebet"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/Trizachebet"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot savings Documentation ",
				url = "https://github.com/Trizachebet"
		)

)
public class SavingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavingsApplication.class, args);
	}

}
