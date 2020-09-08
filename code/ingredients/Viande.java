package ingredients;

public class Viande extends Ingredient
{
    private Double poids;

    public Viande()
    {

    }

    public Viande(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
