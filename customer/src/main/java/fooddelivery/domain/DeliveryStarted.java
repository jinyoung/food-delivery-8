package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private Long orderId;
}
