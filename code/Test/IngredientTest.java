package Test;

import ingredients.Ingredient;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {

    Ingredient ingredient;

    @Before
    public void setVarables(){
        ingredient = new Ingredient();
    }

    @Test
    public void getNom() {
        ingredient.getNom();
    }

    @Test
    public void setNom() {
        ingredient.setNom("test name");
    }

    @Test
    public void getDescription() {
        ingredient.getDescription();
    }

    @Test
    public void setDescription() {
        ingredient.setDescription("test description");
    }
}