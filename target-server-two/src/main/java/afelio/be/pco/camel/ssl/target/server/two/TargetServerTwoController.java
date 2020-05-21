package afelio.be.pco.camel.ssl.target.server.two;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TargetServerTwoController {

    @Value("${server.port}")
    private int port;

    @GetMapping
    public ResponseEntity<String> execute() {
        return ResponseEntity.ok(String.format("connection to %s ok", port));
    }
}
