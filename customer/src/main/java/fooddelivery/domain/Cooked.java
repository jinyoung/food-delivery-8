package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class Cooked extends AbstractEvent {

    private Long id;
    private String foodId;
    private String preference;
    private Long orderId;
    private String status;
}
