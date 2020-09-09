package ingredients;

public class Legume extends Ingredient
{
    private Double poids;

    /**
     * Constructeur de la classe
     */
    public Legume()
    {

    }

    /**
     * Constructeur de la classe avec parametres
     * @param nom
     * @param description
     * @param nouveauPoids
     */
    public Legume(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
