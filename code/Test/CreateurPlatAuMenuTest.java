package Test;

import menufact.plats.CreateurPlatAuMenu;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateurPlatAuMenuTest {

    PlatAuMenu platAuMenu;
    PlatEnfant platEnfant;
    PlatSante platSante;
    CreateurPlatAuMenu createurPlatAuMenu;

    @Before
    public void setVariable(){
        platAuMenu = new PlatAuMenu();
        platEnfant = new PlatEnfant();
        platSante = new PlatSante();
        createurPlatAuMenu = new CreateurPlatAuMenu();
    }

    @Test
    public void creerPlatMenu() {
        createurPlatAuMenu.creerPlatMenu();
        createurPlatAuMenu.creerPlatMenu(1,"d1",1);
    }

    @Test
    public void creerPlatSante() {
        createurPlatAuMenu.creerPlatSante();
        createurPlatAuMenu.creerPlatSante(2, "d2", 2,2,2,2);
    }

    @Test
    public void creerPlatEnfant() {
        createurPlatAuMenu.creerPlatEnfant();
        createurPlatAuMenu.creerPlatEnfant(3,"d3",3,3);
    }

}