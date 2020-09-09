package ingredients;

public class Laitier extends Ingredient
{
    private Double volume;

    /**
     * Constructeur de la classe
     */
    public Laitier()
    {

    }

    /**
     * Constructeur de la classe avec parametres
     * @param nom
     * @param description
     * @param nouveauVolume
     */
    public Laitier(String nom, String description, Double nouveauVolume)
    {
        super(nom, description);

        //Lancer exception si volume negatif
        volume = nouveauVolume;
    }
}
