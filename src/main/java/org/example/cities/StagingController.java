package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

    @RequestMapping("/")
    public String index() {
	String vcap_application = System.getProperty("VCAP_APPLICATION");

        String timestamp = vcap_application.replace(".*\"started_at\":\"([^\"]*)\".*", "$1");
        return "Application was staged at: " + timestamp;
    }
}
