package Test;

import ingredients.CreateurIngredient;
import ingredients.Ingredient;
import ingredients.Produit;
import inventaire.Inventaire;
import menufact.plats.PlatAuMenu;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatAuMenuTest {

    PlatAuMenu platAuMenu;
    CreateurIngredient createurIngredient;


    @Before
    public void setVariable(){
        platAuMenu = new PlatAuMenu();
        createurIngredient = new CreateurIngredient();
    }

    @Test
    public void getIngredients() {
        platAuMenu.getIngredients();
    }

    @Test
    public void addIngredient() {
        Produit e1 = createurIngredient.CreerEpice();
        Produit e2 = createurIngredient.CreerEpice("basilic", "feuille",0.1);
        Produit f3 = createurIngredient.CreerLaitier("fromage","brie",10.00);

        Inventaire inventaire = new Inventaire();
        inventaire.ajouter(e2);
    }

    @Test
    public void testToString() {
        platAuMenu.toString();
    }

    @Test
    public void getCode() {
        platAuMenu.getCode();
    }

    @Test
    public void setCode() {
        platAuMenu.setCode(0);
    }

    @Test
    public void getDescription() {
        platAuMenu.getDescription();
    }

    @Test
    public void setDescription() {
        platAuMenu.setDescription("desc");
    }

    @Test
    public void getPrix() {
        platAuMenu.getPrix();
    }

    @Test
    public void setPrix() {
        platAuMenu.setPrix(10.00);
    }
}