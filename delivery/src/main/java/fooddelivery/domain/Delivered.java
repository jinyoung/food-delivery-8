package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Delivered extends AbstractEvent {

    private Long id;

    public Delivered(Delivery aggregate) {
        super(aggregate);
    }

    public Delivered() {
        super();
    }
    // keep

}
