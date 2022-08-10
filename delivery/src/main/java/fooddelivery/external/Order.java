package fooddelivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class Order {

    private Long id;
    private String foodId;
    private String customerId;
    private String preference;
    private String options;
    private Object address;
    private String status;
    // keep

}
