package ingredients;

public class CreateurIngredient
{
    public Produit CreerIngredient()
    {
        return new Ingredient();
    }

    public Produit CreerIngredient(String nom, String description)
    {
        return new Ingredient(nom, description);
    }

    public Produit CreerFruit()
    {
        return new Fruit();
    }

    public Produit CreerFruit(String nom, String description, Double poids)
    {
        return new Fruit(nom, description, poids);
    }

    public Produit CreerLegume()
    {
        return new Legume();
    }

    public Produit CreerLegume(String nom, String description, Double poids)
    {
        return new Legume(nom, description, poids);
    }

    public Produit CreerViande()
    {
        return new Viande();
    }

    public Produit CreerViande(String nom, String description, Double poids)
    {
        return new Viande(nom, description, poids);
    }

    public Produit CreerLaitier()
    {
        return new Laitier();
    }

    public Produit CreerLaitier(String nom, String description, Double volume)
    {
        return new Laitier(nom, description, volume);
    }

    public Produit CreerEpice()
    {
        return new Fruit();
    }

    public Produit CreerEpice(String nom, String description, Double poids)
    {
        return new Fruit(nom, description, poids);
    }
}
