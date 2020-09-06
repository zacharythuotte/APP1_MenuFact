package menufact;

import menufact.Menu;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;

public class TestMenuFact03 {
    public static void main(String[] args) {

        try {
            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            PlatAuMenu p1 = new PlatAuMenu(0, "Frites sauce", 11.50);
            System.out.println(p1);

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
        }catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }

    }
}
