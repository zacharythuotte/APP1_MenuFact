package Test;

import menufact.Menu;
import menufact.MenuController;
import menufact.MenuView;
import menufact.plats.CreateurPlatAuMenu;
import menufact.plats.Plat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuControllerTest {


    Menu m1;
    MenuView view;
    MenuController menuController;


    @Before
    public void setVariable(){
        m1 = new Menu("description");
        view = new MenuView();
        menuController = new MenuController(m1,view);
    }

    @Test
    public void setMenuDescription() {
       menuController.setMenuDescription("desc");
    }

    @Test
    public void getMenuDescription() {
        menuController.getMenuDescription();
    }

    @Test
    public void setMenuPosition() {
        menuController.setMenuPosition(0);
    }

    @Test
    public void getMenuPosition() {
        menuController.getMenuPosition();
    }

    @Test
    public void getMenuPlats() {
        menuController.getMenuPlats();
    }

    @Test
    public void updateView() {

        CreateurPlatAuMenu createurPlatAuMenu = new CreateurPlatAuMenu();

        Plat p1 = createurPlatAuMenu.creerPlatMenu();
        Plat p2 = createurPlatAuMenu.creerPlatEnfant();
        Plat p3 = createurPlatAuMenu.creerPlatSante();
        Plat p4 = createurPlatAuMenu.creerPlatMenu(12, "ordinaire", 1.00);
        Plat p5 = createurPlatAuMenu.creerPlatEnfant(8, "enfant", 100,3);
        Plat p6 = createurPlatAuMenu.creerPlatSante(111,"santee", 112,2,2,2);

        Menu m1 = new Menu("lol");

        m1.ajoute(p1);
        m1.ajoute(p2);
        m1.ajoute(p3);
        m1.ajoute(p4);
        m1.ajoute(p5);
        m1.ajoute(p6);

        MenuView view = new MenuView();
        MenuController menuController = new MenuController(m1,view);

        menuController.updateView();

        menuController.updateView(0);
    }


}