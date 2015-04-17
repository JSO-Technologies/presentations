package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloApplication {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService service() {
        return new HelloService();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
