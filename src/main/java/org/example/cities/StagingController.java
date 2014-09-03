package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

    @RequestMapping("/")
    public String index() {
	String vcap_application = System.getenv("VCAP_APPLICATION");

        String timestamp = vcap_application.replaceFirst(".*\"started_at\":\"([^\"]*)\".*", "$1");
        return "<html><body><h1>Application was staged for Disney again at: " + timestamp + "</h1></body></html>";
    }
}
