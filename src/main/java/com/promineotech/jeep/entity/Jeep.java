/**
 * 
 */
package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import org.springframework.http.ResponseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author UJJVAL
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Jeep {
  private Long modelPK;
  private JeepModel modelId;
  private String trimLevel;
  private int numDoors;
  private int wheelSize;
  private BigDecimal basePrice;
  /**
   * @param uri
   * @param class1
   * @return
   */
  public ResponseEntity<Jeep> getForEntity(String uri, Class<Jeep> class1) {
    // TODO Auto-generated method stub
    return null;
  }
  /**
   * @return
   */
  public static JeepBuilder builder() {
    // TODO Auto-generated method stub
    return null;
  }


}
