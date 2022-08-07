package fooddelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
public class Address {

    private String street;

    private String city;

    private String state;

    private String country;

    private String zipcode;
}
