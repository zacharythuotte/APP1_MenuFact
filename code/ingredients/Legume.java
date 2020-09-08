package ingredients;

public class Legume extends Ingredient
{
    private Double poids;

    public Legume()
    {

    }

    public Legume(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
