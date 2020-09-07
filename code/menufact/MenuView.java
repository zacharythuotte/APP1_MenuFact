package menufact;

import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class MenuView {


    public void PrintMenuDetails(String description, ArrayList<PlatAuMenu> plat) {
        System.out.println("description= " + description);
        System.out.println("Plat= " + plat.toString());

    }
    public void PrintMenuDetails(String description, ArrayList<PlatAuMenu> plat, int courant)
    {
        boolean isFound = false;
        System.out.println("description= " + description);
        System.out.println("courant= " + courant);
        for (PlatAuMenu p : plat) {
            if (p.getCode() == courant) {
                System.out.println("Plat= " + p.toString());
                isFound = true;
            }

        }
        if (!isFound)
            System.out.println("aucun plat avec code " + courant);

    }

}
