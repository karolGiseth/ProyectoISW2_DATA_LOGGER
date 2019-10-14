package co.com.edu.uan.proyecto.proyectoisw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Proyectoisw2Application extends SpringBootServletInitializer{

	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
	         return app.sources(Proyectoisw2Application.class);
	     }
	
	public static void main(String[] args) {
		SpringApplication.run(Proyectoisw2Application.class, args);
	}

}
