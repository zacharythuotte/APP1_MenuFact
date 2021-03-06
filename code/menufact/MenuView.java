package menufact;

import menufact.plats.PlatAuMenu;
import menufact.plats.Plat;

import java.util.ArrayList;

public class MenuView {

    /**
     * affiche a l ecran les information du menu
     * @param description
     * @param plat
     */
    public void PrintMenuDetails(String description, ArrayList<Plat> plat) {
        System.out.println("description= " + description);
        System.out.println("Plat= " + plat.toString());

    }

    /**
     * affiche a l ecran les information d un plat specifique
     * @param description
     * @param plat
     * @param courant
     */
    public void PrintMenuDetails(String description, ArrayList<Plat> plat, int courant)
    {
        boolean isFound = false;
        System.out.println("description= " + description);
        System.out.println("courant= " + courant);
        for (Plat p : plat) {
            if (p.getCode() == courant) {
                System.out.println("Plat= " + p.toString());
                isFound = true;
            }

        }
        if (!isFound)
            System.out.println("aucun plat avec code " + courant);

    }

}
