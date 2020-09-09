package menufact.facture;

import menufact.Chef;
import menufact.facture.exceptions.FactureException;
import menufact.plats.CreateurPlatAuMenu;
import menufact.plats.Plat;
import menufact.plats.PlatChoisi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Classe de tests pour les modeles dee conception qui ont rapport avec Facture
 */
public class FactureTest
{
    Facture f1;
    PlatChoisi p1;
    Chef c1;

    @Before
    public void fonctionBefore()
    {
        f1 = new Facture("FactureTest");

        CreateurPlatAuMenu c = new CreateurPlatAuMenu();
        Plat p = c.creerPlatMenu();
        p1 = new PlatChoisi(p, 2);

        c1 = new Chef("Domingo");
    }

    @Test
    public void payer()
    {
        f1.changeEtat(new EtatOuverte());
        f1.payer();

        f1.changeEtat(new EtatPayee());
        f1.payer();

        f1.changeEtat(new EtatFermee());
        f1.payer();
    }

    @Test
    public void fermer()
    {
        f1.changeEtat(new EtatOuverte());
        f1.fermer();

        f1.changeEtat(new EtatPayee());
        f1.fermer();

        f1.changeEtat(new EtatFermee());
        f1.fermer();
    }

    @Test
    public void ouvrir()
    {
        try
        {
            f1.changeEtat(new EtatOuverte());
            f1.ouvrir();

            f1.changeEtat(new EtatPayee());
            f1.ouvrir();

            f1.changeEtat(new EtatFermee());
            f1.ouvrir();
        }
        catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
    }

    @Test
    public void getEtat()
    {
        System.out.println(f1.getEtat());
    }

    @Test
    public void ajoutePlat()
    {
        try
        {
            f1.ajoutePlat(p1);
        }
            catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
    }

    @Test
    public void ajouterCuisinier()
    {
        f1.ajouterCuisinier(c1);
    }

    @Test
    public void retirerCuisinier()
    {
        f1.retirerCuisinier(c1);
    }

    @Test
    public void avertirCuisiniers()
    {
        try
        {
            f1.avertirCuisiniers(p1);
        }
        catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
    }
}