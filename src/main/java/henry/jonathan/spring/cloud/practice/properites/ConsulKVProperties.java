package henry.jonathan.spring.cloud.practice.properites;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by henry.jonathan on 1/17/2018
 */
@ConfigurationProperties("test")
@Component
@RefreshScope
@Data
public class ConsulKVProperties {
  private String message;
}
