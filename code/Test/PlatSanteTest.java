package Test;

import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatSanteTest {

    PlatSante platsante;

    @Before
    public void setVariable(){
        platsante = new PlatSante();
    }

    @Test
    public void testToString() {
        platsante.toString();
    }

    @Test
    public void getKcal() {
        platsante.getKcal();
    }

    @Test
    public void getChol() {
        platsante.getChol();
    }

    @Test
    public void getGras() {
        platsante.getGras();
    }
}