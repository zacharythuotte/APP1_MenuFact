package ingredients;

public class Ingredient implements  Produit
{
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    public Ingredient() { }

    public Ingredient(String nouveauNom, String nouvelleDescription)
    {
        this.nom = nouveauNom;
        this.description = nouvelleDescription;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public TypeIngredient getTypeIngredient() {
//        return typeIngredient;
//    }

//    public void setTypeIngredient(TypeIngredient typeIngredient)
//    {
//        this.typeIngredient = typeIngredient;
//    }
}
