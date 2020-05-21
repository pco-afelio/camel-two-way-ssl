package be.afelio.pco.camel.ssl.relay.server;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("by-camel-route")
public class CamelServerRouteRelay {

    @Autowired
    private ProducerTemplate producerTemplate;

    @GetMapping("one")
    public ResponseEntity<String> one() {
        final String response = producerTemplate.requestBody(ServerOneRouteBuilder.route, null, String.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("two")
    public ResponseEntity<String> two() {
        final String response = producerTemplate.requestBody(ServerTwoRouteBuilder.route, null, String.class);
        return ResponseEntity.ok(response);
    }
}
