package pl.redhat.samples.messaging.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SimpleConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SimpleConsumer.class, args);
    }

}
