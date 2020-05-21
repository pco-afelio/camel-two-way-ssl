package be.afelio.pco.camel.ssl.target.server.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TargetServerOneController {

    @Value("${server.port}")
    private int port;

    @GetMapping
    public ResponseEntity<String> execute() {
        return ResponseEntity.ok(String.format("connection to %s ok", port));
    }
}
