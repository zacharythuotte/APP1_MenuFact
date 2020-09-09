package inventaire;

import ingredients.Ingredient;
import ingredients.Produit;

import java.util.ArrayList;

public class Inventaire
{
    private ArrayList<Produit> lesProduits = new ArrayList<>();

    /**
     * Methode pour ajouter un nouvel ingredient a l inventaire
     * @param a
     */
    public void ajouter (Produit a)
    {
        lesProduits.add(a);
    }

}
