package menufact;

import menufact.Menu;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.facture.exceptions.FactureException;
import menufact.plats.*;

import menufact.Chef;

public class TestMenuFact03
{
    public static void main(String[] args)
    {
        try {
            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            PlatAuMenu p1 = new PlatAuMenu(0, "Frites sauce", 11.50);
            System.out.println(p1);

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            PlatAuMenu p2 = new PlatAuMenu(1, "cote levee erable", 20.00);
            System.out.println(p2);

            System.out.println("== Plat choisi");
            PlatChoisi pch1 = new PlatChoisi(p1, 5);
            System.out.println(pch1);

            System.out.println("== New menufact.facture.Facture");
            Facture facture = new Facture("Ma facture");
            System.out.println(facture);

            System.out.println("== Ajout d'un plat choisie à la facture");
            facture.ajoutePlat(pch1);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

//            System.out.println("== Ajout d'un plat choisie à la facture");
//            PlatChoisi pch2 = new PlatChoisi(p2, 10);
//            facture.ajoutePlat(pch2);
//            System.out.println(facture);
//            System.out.println(facture.sousTotal());

            System.out.println(facture.total());
            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.fermer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.payer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

          /*
            MenuView mv1 = new MenuView();
            MenuController controller = new MenuController(m1, mv1);

            m1.ajoute(p1);
            controller.updateView();

            m1.ajoute(p2);
            controller.updateView();

            m1.ajoute(2,"spagetti", 10.00);
            controller.updateView(2);
            controller.updateView();

            controller.updateView(3);
*/
            TestMenuFact03 t = new TestMenuFact03();

            Menu m1 = new Menu("Premier menu");

            t.testMenu(m1);

            Facture f1 = new Facture("Ma facture");
            t.testChef(f1);

//            t.testEtatsPlats();


        }catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }

    }

    public void testEtatsPlats()
    {
        System.out.println("\n----- Test de l etat des plats");

        CreateurPlatAuMenu createurPlatAuMenu = new CreateurPlatAuMenu();

        Plat p1 = createurPlatAuMenu.creerPlatMenu(12, "ordinaire", 1.00);
        PlatChoisi platChoisi = new PlatChoisi(p1 , 2);

        System.out.println("\n----- a");
        platChoisi.setEtat(new EtatCommande(platChoisi));
        System.out.println("\n----- b");

//        try
//        {
//            f1.ajoutePlat(platChoisi);
//        }
//        catch (Exception fe)
//        {
//
//        }
//
//        f1.
    }

    public void testChef(Facture f1)
    {
        System.out.println("\n----- [Observer] Test de chef");

        Chef c1 = new Chef("Jean");

        f1.ajouterCuisinier(c1);

        CreateurPlatAuMenu createurPlatAuMenu = new CreateurPlatAuMenu();
        Plat p1 = createurPlatAuMenu.creerPlatMenu(12, "ordinaire", 1.00);
        PlatChoisi platChoisi = new PlatChoisi(p1 , 2);

        try
        {
            f1.avertirCuisiniers(platChoisi);
        }
        catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }

        f1.retirerCuisinier(c1);

        try
        {
            f1.avertirCuisiniers(platChoisi);
        }
        catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }

//        try
//        {
//            f1.ajouterCuisinier(c1);
//        }
//        catch (FactureException fe)
//        {
//            throw fe;
//        }
        System.out.println(f1);
    }

    public void testMenu(Menu m1)
    {
        System.out.println("\n----- [State] Test de l etat des plats");

        CreateurPlatAuMenu createurPlatAuMenu = new CreateurPlatAuMenu();

        Plat p1 = createurPlatAuMenu.creerPlatMenu();
        Plat p2 = createurPlatAuMenu.creerPlatEnfant();
        Plat p3 = createurPlatAuMenu.creerPlatSante();
        Plat p4 = createurPlatAuMenu.creerPlatMenu(12, "ordinaire", 1.00);
        Plat p5 = createurPlatAuMenu.creerPlatEnfant(8, "enfant", 100,3);
        Plat p6 = createurPlatAuMenu.creerPlatSante(111,"santee", 112,2,2,2);

        m1.ajoute(p1);
        m1.ajoute(p2);
        m1.ajoute(p3);
        m1.ajoute(p4);
        m1.ajoute(p5);
        m1.ajoute(p6);

        MenuView view = new MenuView();
        MenuController menuController = new MenuController(m1,view);

        menuController.updateView();

    }
}
