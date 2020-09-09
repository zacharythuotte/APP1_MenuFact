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

    /**
     * change la description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * pronds la description
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * change la position
     * @param position
     */
    public void setPosition(int position) {
        this.courant = position;
    }

    /**
     * prends la position
     * @return
     */
    public int getPosition() {
        return courant;
    }

    /**
     * retourne la liste de plats
     * @return
     */
    public ArrayList<Plat> getPlat()
    {
        return lesPlats;
    }

    /**
     * ajoute un plat deja cree a la liste de plat
     * @param p
     */
    public void ajoute (Plat p)
    {
        lesPlats.add(p);
    }

    /**
     * cree et ajouje un plat a la liste de platss
     * @param code
     * @param description
     * @param prix
     */
    public void ajoute (int code, String description, double prix)
    {
        CreateurPlatAuMenu createur = new CreateurPlatAuMenu();
        Plat plat = createur.creerPlatMenu(code,description,prix);//new PlatAuMenu(code,description,prix);

        lesPlats.add(plat);
    }

    /**
     * change la position courante
     * @param i
     */
    public void position(int i)
    {
        courant = i;
    }

    /**
     * retourne le plat de l indexe dans la liste de plats
     * @return
     */
    public Plat platCourant()
    {
        return lesPlats.get(courant);
    }

    /**
     *  donne la position suivante du plat au menu
     * @throws MenuException
     */
    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= lesPlats.size())
            throw new MenuException("On depasse le nombre maximal de plats.");
        else
            courant++;
    }

    /**
     * donne la position precedente du plat au menu
     * @throws MenuException
     */
    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimal de plats");
        else
            courant--;
    }

    /**
     * change la fonction de print a la console
     * @return
     */
    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + lesPlats +
                '}';
    }
}
