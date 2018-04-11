package henry.jonathan.spring.cloud.practice.controller;

import henry.jonathan.spring.cloud.practice.service.api.TryHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by henry.jonathan on 3/13/2018
 */
@RestController
public class TryHystrixController {

  @Autowired
  private TryHystrixService tryHystrixService;

  @PostMapping("hystrix")
  public String post() {
    String result = tryHystrixService.failedMethod();

    return result;
  }
}
