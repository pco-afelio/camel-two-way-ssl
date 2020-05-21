package be.afelio.pco.camel.ssl.relay.server;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServerOneRouteBuilder extends RouteBuilder {

    public static final String route = "direct:server.one";

    @Value("${target.server.one.url}")
    private String targetServerOneUrl;

    @Override
    public void configure() throws Exception {
        from(route).to(targetServerOneUrl);
    }
}
