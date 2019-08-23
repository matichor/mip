package com.engineer.scheduler;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.net.UnknownHostException;

@Component
public class RefreshProcessor {


    @Scheduled(fixedRate = 1750000)
    public void refreshTask() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("https://mip-team.herokuapp.com/api", String.class);
        response.getBody();
    }

}
