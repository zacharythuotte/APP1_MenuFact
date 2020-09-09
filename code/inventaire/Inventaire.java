package inventaire;

import ingredients.Ingredient;
import ingredients.Produit;

import java.util.ArrayList;

public class Inventaire
{
    private ArrayList<Produit> lesProduits = new ArrayList<>();

    public void ajouter (Produit a)
    {
        lesProduits.add(a);
    }

//
//    @Override
//    public String toString() {
//
//
//        return "Inventaire{" +
//                "Produits='" + lesProduits + '\'';
//  }
}
