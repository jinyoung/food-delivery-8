package fooddelivery.infra;

import fooddelivery.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/menus")
@Transactional
public class MenuController {

    @Autowired
    MenuRepository menuRepository;

    @RequestMapping(
        value = "menus/{id}/remove",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Menu 메뉴삭제(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /menu/메뉴삭제  called #####");
        Optional<Menu> optionalMenu = menuRepository.findById(id);

        optionalMenu.orElseThrow(() -> new Exception("No Entity Found"));
        Menu menu = optionalMenu.get();
        menu.메뉴삭제();

        menuRepository.save(menu);
        return menu;
    }

    @RequestMapping(
        value = "menus/{id}/set-price",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Menu changePrice(
        @PathVariable(value = "id") Long id,
        @RequestBody ChangePriceCommand changePriceCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /menu/changePrice  called #####");
        Optional<Menu> optionalMenu = menuRepository.findById(id);

        optionalMenu.orElseThrow(() -> new Exception("No Entity Found"));
        Menu menu = optionalMenu.get();
        menu.changePrice(changePriceCommand);

        menuRepository.save(menu);
        return menu;
    }
    // keep
}
