package ingredients;

public interface Produit
{
    /**
     * Methode pour obtenir le nom
     * @return
     */
    public String getNom();

    /**
     * Methode pour definir le nom
     * @param nom
     */
    public void setNom(String nom);

    /**
     * Methode pour obtenir la description
     * @return
     */
    public String getDescription();

    /**
     * Methode pour definir la description
     * @param description
     */
    public void setDescription(String description);

//    public TypeIngredient getTypeIngredient();
//
//    public void setTypeIngredient(TypeIngredient typeIngredient);
}
