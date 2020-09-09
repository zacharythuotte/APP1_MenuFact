package ingredients;

public class Ingredient implements  Produit
{
    private String nom;
    private String description;

    /**
     * Constructeur de la classe
     */
    public Ingredient() { }

    /**
     * Constructeur de la classe avec parametres
     * @param nouveauNom
     * @param nouvelleDescription
     */
    public Ingredient(String nouveauNom, String nouvelleDescription)
    {
        this.nom = nouveauNom;
        this.description = nouvelleDescription;
    }

    /**
     * Methode pour obtenir le nom
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Methode pour definir le nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Methode pour obtenir la description
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Methode pour definir la description
     * @param description
     */
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
