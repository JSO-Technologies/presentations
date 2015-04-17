package demo.healthcheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TalendHealthCheck implements HealthIndicator {
    @Override
    public Health health() {
        //verif

        return Health.up().build();
    }
}
