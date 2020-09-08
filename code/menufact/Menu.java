package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.CreateurPlatAuMenu;
import menufact.plats.Plat;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class Menu
{
    private String description;
    private int courant;
    private ArrayList<Plat> lesPlats = new ArrayList<Plat>();

    public Menu(String description) {
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPosition(int position) {
        this.courant = position;
    }

    public int getPosition() {
        return courant;
    }

    public ArrayList<Plat> getPlat()
    {
        return lesPlats;
    }

    void ajoute (Plat p)
    {
        lesPlats.add(p);
    }
    void ajoute (int code, String description, double prix)
    {
        CreateurPlatAuMenu createur = new CreateurPlatAuMenu();
        Plat plat = createur.creerPlatAuMenu();//new PlatAuMenu(code,description,prix);

        lesPlats.add(plat);
    }

    public void position(int i)
    {
        courant = i;
    }

    public Plat platCourant()
    {
        return lesPlats.get(courant);
    }

    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= lesPlats.size())
            throw new MenuException("On depasse le nombre maximal de plats.");
        else
            courant++;
    }

    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimal de plats");
        else
            courant--;
    }


    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + lesPlats +
                '}';
    }
}
