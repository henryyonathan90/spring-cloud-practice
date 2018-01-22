package henry.jonathan.spring.cloud.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by henry.jonathan on 1/17/2018
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
