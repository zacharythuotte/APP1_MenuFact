package Test;

import menufact.Menu;
import menufact.MenuController;
import menufact.MenuView;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuViewTest {

    Menu m1;
    MenuView view;
    MenuController menuController;



    @Before
    public void setVariable() {
        m1 = new Menu("description");
        view = new MenuView();
        menuController = new MenuController(m1, view);
    }

    @Test
    public void printMenuDetails() {
        view.PrintMenuDetails(menuController.getMenuDescription(), menuController.getMenuPlats());
        view.PrintMenuDetails(menuController.getMenuDescription(), menuController.getMenuPlats(), 0);
    }
}