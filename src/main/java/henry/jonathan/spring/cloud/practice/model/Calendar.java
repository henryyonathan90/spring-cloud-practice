package henry.jonathan.spring.cloud.practice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by henry.jonathan on 4/9/2018
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Calendar {
  private String calendarName;
  private int baseYear;
  private int month;
  private int day;
  private String holidayName;
}
