package Test;

import ingredients.Ingredient;
import ingredients.Produit;
import inventaire.Inventaire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventaireTest {

    Inventaire inventaire;
    Ingredient ingredient;

    @Before
    public void setVariable(){
        inventaire = new Inventaire();
        ingredient = new Ingredient();
    }

    @Test
    public void ajouter() {
        inventaire.ajouter(ingredient);

    }
}