package Test;

import menufact.Chef;
import menufact.facture.Facture;
import menufact.plats.CreateurPlatAuMenu;
import menufact.plats.EtatImpossible;
import menufact.plats.Plat;
import menufact.plats.PlatChoisi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatChoisiTest
{
    PlatChoisi p1;

    @Before
    public void fonctionBefore()
    {
        CreateurPlatAuMenu c = new CreateurPlatAuMenu();
        Plat p = c.creerPlatMenu();
        p1 = new PlatChoisi(p, 5);
    }

    @Test
    public void setQuantite()
    {
        p1.setQuantite(10);
    }

    @Test
    public void getPlat()
    {
        System.out.println(p1.getPlat());
    }

    @Test
    public void setEtat()
    {
        System.out.println(p1);
        EtatImpossible a = new EtatImpossible(p1);
        p1.setEtat(a);
        System.out.println(p1);
    }
}