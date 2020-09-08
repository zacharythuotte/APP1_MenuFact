package ingredients;

public class Epice extends Ingredient
{
    private Double poids;

    public Epice()
    {

    }

    public Epice(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
