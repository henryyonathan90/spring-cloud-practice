package henry.jonathan.spring.cloud.practice.controller;

import henry.jonathan.spring.cloud.practice.properites.ConsulKVProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by henry.jonathan on 1/17/2018
 */
@RefreshScope
@RestController
public class TryConsulKVController {

  @Value("${message}")
  private String message;

  @Autowired
  private ConsulKVProperties consulKVProperties;

  @GetMapping("hello/api1")
  public String api1() {
    return message;
  }


  @GetMapping("hello/api2")
  public String api2() {
    return consulKVProperties.getMessage();
  }
}
