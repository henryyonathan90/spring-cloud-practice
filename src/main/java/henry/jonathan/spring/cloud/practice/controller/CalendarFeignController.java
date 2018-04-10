package henry.jonathan.spring.cloud.practice.controller;

import henry.jonathan.spring.cloud.practice.model.Calendar;
import henry.jonathan.spring.cloud.practice.model.RestResponse;
import henry.jonathan.spring.cloud.practice.outbound.feign.CalendarFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by henry.jonathan on 4/9/2018
 */
@RestController
public class CalendarFeignController {

  @Autowired
  private CalendarFeign calendarFeign;

  @GetMapping("api/calendar/find")
  public RestResponse<Calendar> getCalendarByName() {

    Map<String, Object> requestParam = new HashMap<>();
    requestParam.put("storeId", "10001");
    requestParam.put("requestId", "RANDOM");
    requestParam.put("channelId", "travel-web");
    requestParam.put("clientId", "travel-rest-api");
    requestParam.put("username", "travel-rest-api");
    requestParam.put("calendarName", "default");
    requestParam.put("page", 0);
    requestParam.put("size", 1000);

    return calendarFeign.getCalendarByName(requestParam);
  }
}
