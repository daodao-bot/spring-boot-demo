package run.ice.fun.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import run.ice.fun.demo.api.DemoApi;

@Configuration
public class DemoClient {

    private final HttpServiceProxyFactory httpServiceProxyFactory;

    @Autowired
    public DemoClient(@Value("${app.service.fun.demo:demo.fun}") String service, RestClient.Builder builder) {
        String url = (service.matches("^https?://.*") ? service : "http://" + service) + "/";
        this.httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(builder.baseUrl(url).build())).build();
    }

    @Bean
    public DemoApi demoApi() {
        return httpServiceProxyFactory.createClient(DemoApi.class);
    }

}
