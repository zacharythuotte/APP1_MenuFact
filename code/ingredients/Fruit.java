package ingredients;

public class Fruit extends Ingredient
{
    private Double poids;

    /**
     * Constructeur de la classe
     */
    public Fruit()
    {

    }

    /**
     * Constructeur de la classe avec parametres
     * @param nom
     * @param description
     * @param nouveauPoids
     */
    public Fruit(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
