package comliveproject.salonapi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "salon")
public class AppConfig {


    String name;
    String address;
    String city;
    String state;
    String zipcode;
    String phone;
}
