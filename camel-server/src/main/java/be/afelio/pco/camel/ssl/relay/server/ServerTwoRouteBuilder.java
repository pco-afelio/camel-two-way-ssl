package be.afelio.pco.camel.ssl.relay.server;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServerTwoRouteBuilder extends RouteBuilder {

    public static final String route = "direct:server.two";

    @Value("${target.server.two.url}")
    private String targetServerTwoUrl;

    @Override
    public void configure() throws Exception {
        from(route).to(targetServerTwoUrl);
    }
}
