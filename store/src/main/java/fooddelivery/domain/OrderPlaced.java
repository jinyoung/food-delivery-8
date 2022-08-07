package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private String customerId;
    private String preference;
}
