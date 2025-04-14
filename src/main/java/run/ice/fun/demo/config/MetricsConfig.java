package run.ice.fun.demo.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

/**
 * @author DaoDao
 */
@Configuration
public class MetricsConfig {

    @Value("${spring.application.name:}")
    private String application;


    @Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        String namespace = Optional.ofNullable(System.getenv("NAMESPACE")).orElse("fun");
        String hostname = Optional.ofNullable(System.getenv("HOSTNAME")).orElse("hostname");
        return (registry) -> registry.config()
                .commonTags("service.name", application)
                .commonTags("service.namespace", namespace)
                .commonTags("application", application)
                .commonTags("namespace", namespace)
                .commonTags("hostname", hostname)
                .commonTags("instance", hostname)
                ;
    }

}
