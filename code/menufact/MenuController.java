package menufact;

import menufact.plats.PlatAuMenu;
import menufact.plats.Plat;

import java.util.ArrayList;

public class MenuController {
    private Menu menu;
    private MenuView view;

    public MenuController(Menu menu, MenuView view)
    {
        this.menu = menu;
        this.view = view;
    }

    /**
     * change la description du menu
     * @param description
     */
    public void setMenuDescription(String description){
        menu.setDescription(description);
    }

    /**
     * retourne la description du menu
     * @return
     */
    public String getMenuDescription(){
        return menu.getDescription();
    }

    /**
     * change la description du menu
     * @param position
     */
    public void setMenuPosition(int position){
        menu.setPosition(position);
    }

    /**
     * retourne la position du menu
     * @return
     */
    public int getMenuPosition(){
        return menu.getPosition();
    }

    /**
     * retourne la liste des plats au menu
     * @return
     */
    public ArrayList<Plat> getMenuPlats()
    {
        return menu.getPlat();
    }

    /**
     * donne les info complete du menu
     */
    public void updateView()
    {
        view.PrintMenuDetails(menu.getDescription(), menu.getPlat());
    }

    /**
     * donne les info specifique d un plat au menu selon l index
     * @param index
     */
    public void updateView(int index)
    {
        view.PrintMenuDetails(menu.getDescription(), menu.getPlat(), index);
    }
}

