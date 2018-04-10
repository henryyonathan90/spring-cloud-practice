package henry.jonathan.spring.cloud.practice.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import henry.jonathan.spring.cloud.practice.service.api.HystrixService;
import org.springframework.stereotype.Service;

/**
 * Created by henry.jonathan on 3/19/2018
 */
@Service
public class HystrixServiceImpl implements HystrixService {

  @Override
  @HystrixCommand(fallbackMethod = "fallbackMethod")
  public String failedMethod(){
    throw new RuntimeException("failedMethod");
  }

  @Override
  public String fallbackMethod(){
    return "fallbackMethod";
  }

}