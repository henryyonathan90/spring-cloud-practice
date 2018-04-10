package henry.jonathan.spring.cloud.practice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * Created by henry.jonathan on 4/9/2018
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RestResponse<T> {

  private String requestId;
  private String errorMessage;
  private String errorCode;
  private boolean success;
  private List<T> content;

}
