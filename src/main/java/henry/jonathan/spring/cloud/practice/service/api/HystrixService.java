package henry.jonathan.spring.cloud.practice.service.api;

/**
 * Created by henry.jonathan on 3/19/2018
 */
public interface HystrixService {

  String failedMethod();

  String fallbackMethod();
}
