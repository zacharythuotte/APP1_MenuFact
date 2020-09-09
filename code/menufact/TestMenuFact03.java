package menufact;

import inventaire.Inventaire;
import menufact.Menu;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.facture.exceptions.FactureException;
import menufact.plats.*;
import ingredients.*;

import menufact.Chef;

public class TestMenuFact03 {
    public static void main(String[] args) {
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


            Facture f1 = new Facture("Ma facture");
          

//            t.testEtatsPlats();


        } catch (Exception fe) {
            System.out.println(fe.getMessage());
        }

    }
}
