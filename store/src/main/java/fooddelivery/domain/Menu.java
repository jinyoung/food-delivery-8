package fooddelivery.domain;

import fooddelivery.StoreApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Menu_table")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Embedded
    private Money price;

    @PostPersist
    public void onPostPersist() {
        // Get request from Preference
        //fooddelivery.external.Preference preference =
        //    Application.applicationContext.getBean(fooddelivery.external.PreferenceService.class)
        //    .getPreference(/** mapping value needed */);

    }

    public static MenuRepository repository() {
        MenuRepository menuRepository = StoreApplication.applicationContext.getBean(
            MenuRepository.class
        );
        return menuRepository;
    }

    public void 메뉴삭제() {}

    public void changePrice(ChangePriceCommand changePriceCommand) {}
}
