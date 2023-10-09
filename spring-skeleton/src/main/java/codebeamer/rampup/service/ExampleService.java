package codebeamer.rampup.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;


@Log4j2
public class ExampleService {

//    @Autowired
//    RestClient restClient;

    public String getExample() {

        ResponseEntity<String> entity = RestClient.create("http://www.google.com").get().retrieve().toEntity(String.class);

        log.info("Status code: " + entity.getStatusCode());

        return entity.getBody();

    }



}
