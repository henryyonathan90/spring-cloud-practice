package henry.jonathan.spring.cloud.practice.outbound.feign;

import henry.jonathan.spring.cloud.practice.model.Calendar;
import henry.jonathan.spring.cloud.practice.model.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by henry.jonathan on 4/9/2018
 */
@FeignClient(name = "calendar", url = "${feign.client.calendar.url}")
public interface CalendarFeign {

  @RequestMapping(method = RequestMethod.GET, value = "/api/holiday/getCalendarByName")
  RestResponse<Calendar> getCalendarByName(@RequestParam Map<String, Object> requestParam);
}
