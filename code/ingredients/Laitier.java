package ingredients;

public class Laitier extends Ingredient
{
    private Double volume;

    public Laitier()
    {

    }

    public Laitier(String nom, String description, Double nouveauVolume)
    {
        super(nom, description);

        //Lancer exception si volume negatif
        volume = nouveauVolume;
    }
}
