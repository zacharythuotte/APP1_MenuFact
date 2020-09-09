package ingredients;

/**
 * Createur d ingredients selon specification
 */
public class CreateurIngredient
{
    /**
     * Methode qui cree un ingredient
     * @return
     */
    public Produit CreerIngredient()
    {
        return new Ingredient();
    }

    /**
     * Methode qui retourne un cree ingredient avec parametres
     * @param nom
     * @param description
     * @return
     */
    public Produit CreerIngredient(String nom, String description)
    {
        return new Ingredient(nom, description);
    }

    /**
     * Methode qui cree un nouveau fruit
     * @return
     */
    public Produit CreerFruit()
    {
        return new Fruit();
    }

    /**
     * Methode qui cree un nouveau fruit avec parametres
     * @return
     */
    public Produit CreerFruit(String nom, String description, Double poids)
    {
        return new Fruit(nom, description, poids);
    }

    /**
     * Methode qui cree un nouveau legume
     * @return
     */
    public Produit CreerLegume()
    {
        return new Legume();
    }

    /**
     * Methode qui cree un nouveau legume avec parametres
     * @return
     */
    public Produit CreerLegume(String nom, String description, Double poids)
    {
        return new Legume(nom, description, poids);
    }

    /**
     * Methode qui cree une nouvelle viande
     * @return
     */
    public Produit CreerViande()
    {
        return new Viande();
    }

    /**
     * Methode qui cree une nouvelle viande avec parametres
     * @return
     */
    public Produit CreerViande(String nom, String description, Double poids)
    {
        return new Viande(nom, description, poids);
    }

    /**
     * Methode qui cree une nouveau produit laitier
     * @return
     */
    public Produit CreerLaitier()
    {
        return new Laitier();
    }

    /**
     * Methode qui cree un nouveau produit laitier avec parametres
     * @return
     */
    public Produit CreerLaitier(String nom, String description, Double volume)
    {
        return new Laitier(nom, description, volume);
    }

    /**
     * Methode qui cree une nouvelle epice
     * @return
     */
    public Produit CreerEpice()
    {
        return new Fruit();
    }

    /**
     * Methode qui cree une nouvelle epice avec parametres
     * @return
     */
    public Produit CreerEpice(String nom, String description, Double poids)
    {
        return new Fruit(nom, description, poids);
    }
}
