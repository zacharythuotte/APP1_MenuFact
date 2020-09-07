package menufact;

import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class MenuController {
    private Menu menu;
    private MenuView view;

    public MenuController(Menu menu, MenuView view)
    {
        this.menu = menu;
        this.view = view;
    }

    public void setMenuDescription(String description){
        menu.setDescription(description);
    }

    public String getMenuDescription(){
        return menu.getDescription();
    }

    public void setMenuPosition(int position){
        menu.setPosition(position);
    }

    public int getMenuPosition(){
        return menu.getPosition();
    }

    public ArrayList<PlatAuMenu> getMenuPlats()
    {
        return menu.getPlat();
    }

    public void updateView()
    {
        view.PrintMenuDetails(menu.getDescription(), menu.getPlat());
    }

    public void updateView(int index)
    {
        view.PrintMenuDetails(menu.getDescription(), menu.getPlat(), index);
    }
}

