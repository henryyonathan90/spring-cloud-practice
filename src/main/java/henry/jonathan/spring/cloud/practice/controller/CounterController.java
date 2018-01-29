package henry.jonathan.spring.cloud.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by henry.jonathan on 1/29/2018
 */
@RestController("counter")
public class CounterController {

  private int counter = 0;

  @GetMapping
  public int getCounter() {
    return counter;
  }

  @PutMapping
  public int incrementCounter() {
    counter++;
    return counter;
  }

  @PostMapping
  public void setCounter(int newValue) {
    counter = newValue;
  }
}
