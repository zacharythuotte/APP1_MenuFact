package ingredients;

public class Fruit extends Ingredient
{
    private Double poids;

    public Fruit()
    {

    }

    public Fruit(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
