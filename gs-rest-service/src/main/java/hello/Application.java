package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
All:
    @Configuration
    @EnableAutoConfiguration
    @EnableWebMvc since spring-webmvn is on the classpath
    @ComponentScan for the same package
 */
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
