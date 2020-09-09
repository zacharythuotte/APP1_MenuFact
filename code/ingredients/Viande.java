package ingredients;

public class Viande extends Ingredient
{
    private Double poids;

    /**
     * Constructeur de la classe
     */
    public Viande()
    {

    }

    /**
     * Constructeur de la classe avec parametres
     * @param nom
     * @param description
     * @param nouveauPoids
     */
    public Viande(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
