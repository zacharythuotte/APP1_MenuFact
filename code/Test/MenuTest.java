package Test;

import menufact.Menu;
import menufact.plats.CreateurPlatAuMenu;
import menufact.plats.Plat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MenuTest {

    Menu m1;
    Plat p1;


    @Before
    public void setVariable(){

        m1= new Menu("lol");
        CreateurPlatAuMenu createurPlatAuMenu = new CreateurPlatAuMenu();
        p1 = createurPlatAuMenu.creerPlatMenu(1,"plat",10);
        m1.ajoute(p1);
        m1.ajoute(2,"autre plat", 111.11);



    }



    @Test
    public void setDescription() {
        m1.setDescription("Description");
    }

    @Test
    public void getDescription() {
        m1.getDescription();
    }

    @Test
    public void setPosition() {
        m1.setPosition(0);
    }

    @Test
    public void getPosition() {
        m1.getPosition();
    }

    @Test
    public void getPlat() {

        m1.getPlat();
    }

    @Test
    public void ajoute() {

        m1.ajoute(p1);
        m1.ajoute(1,"lol",10.11);
    }

    @Test
    public void position() {
        m1.position(0);
    }

    @Test
    public void platCourant() {
        m1.platCourant();
    }

    @Test
    public void positionSuivante() {
        positionSuivante();
    }

    @Test
    public void positionPrecedente() {
        positionPrecedente();
    }

    @Test
    public void testToString() {
        m1.toString();
    }
}