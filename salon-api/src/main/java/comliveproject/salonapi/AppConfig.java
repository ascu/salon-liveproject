package comliveproject.salonapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "salon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppConfig {
    String name;
    String address;
    String city;
    String state;
    String zipcode;
    String phone;
}
