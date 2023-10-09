package codebeamer.rampup;

import codebeamer.rampup.service.ExampleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    //    @PostConstruct
    public void init() {
        log.debug("Init");
        String example = new ExampleService().getExample();
        log.debug(example);
    }

}

