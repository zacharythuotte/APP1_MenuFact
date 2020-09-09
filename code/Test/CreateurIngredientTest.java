package Test;

import ingredients.CreateurIngredient;
import ingredients.Produit;
import inventaire.Inventaire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateurIngredientTest {

    CreateurIngredient createurIngredient;

    @Before
    public void setVariable() {

        createurIngredient = new CreateurIngredient();
    }

    @Test
    public void creerIngredient() {
        Produit e1 = createurIngredient.CreerEpice();
        Produit e2 = createurIngredient.CreerEpice("basilic", "feuille",0.1);
        Produit f3 = createurIngredient.CreerLaitier("fromage","brie",10.00);

        Inventaire inventaire = new Inventaire();
        inventaire.ajouter(e2);
    }

    @Test
    public void creerFruit() {
        createurIngredient.CreerFruit();
        createurIngredient.CreerFruit("i1","fruit",1.0);
    }

    @Test
    public void creerLegume() {
        createurIngredient.CreerLegume();
        createurIngredient.CreerLegume("i2","legume",2.0);
    }

    @Test
    public void creerViande() {
        createurIngredient.CreerLegume();
        createurIngredient.CreerLegume("i3","viande",3.0);
    }

    @Test
    public void creerLaitier() {
        createurIngredient.CreerLaitier();
        createurIngredient.CreerLaitier("i4","laitier",4.0);
    }

    @Test
    public void creerEpice() {
        createurIngredient.CreerEpice();
        createurIngredient.CreerEpice("i5","epice",5.0);
    }
}