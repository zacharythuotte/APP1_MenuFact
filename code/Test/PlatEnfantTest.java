package Test;

import ingredients.CreateurIngredient;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatEnfant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatEnfantTest {

    PlatEnfant platEnfant;

    @Before
    public void setVariable(){
        platEnfant = new PlatEnfant();
    }

    @Test
    public void getProportion() {
        platEnfant.getProportion();
    }

    @Test
    public void testToString() {
        platEnfant.toString();
    }
}