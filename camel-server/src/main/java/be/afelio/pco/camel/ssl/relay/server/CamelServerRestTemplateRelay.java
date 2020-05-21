package be.afelio.pco.camel.ssl.relay.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("by-rest-template")
public class CamelServerRestTemplateRelay {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${target.server.one.url}")
    private String targetServerOneUrl;

    @Value("${target.server.two.url}")
    private String targetServerTwoUrl;

    @GetMapping("one")
    public ResponseEntity<String> gotoTargetServerOne() {
        return restTemplate.getForEntity(targetServerOneUrl, String.class);
    }

    @GetMapping("two")
    public ResponseEntity<String> gotoTargetServerTwo() {
        return restTemplate.getForEntity(targetServerTwoUrl, String.class);
    }
}
