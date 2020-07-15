package com.codurance.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class HealthIndicator extends AbstractHealthIndicator {

  @Override
  protected void doHealthCheck(Health.Builder builder) throws Exception {
    builder.up()
        .withDetail("app", "It's working")
        .withDetail("error", "No errors!");
  }
}
