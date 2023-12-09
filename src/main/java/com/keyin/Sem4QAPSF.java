
package com.keyin;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Sem4QAPSF {
    public static void main(String[] args) {
        SpringApplication.run(Sem4QAPSF.class, args);
    }
}