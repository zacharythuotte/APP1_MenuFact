package ingredients;

public class Epice extends Ingredient
{
    private Double poids;

    /**
     * Constructeur de la classe
     */
    public Epice()
    {

    }

    /**
     * Constructeur de la classe avec parametres
     * @param nom
     * @param description
     * @param nouveauPoids
     */
    public Epice(String nom, String description, Double nouveauPoids)
    {
        super(nom, description);

        //Lancer exception si poids negatif
        poids = nouveauPoids;
    }
}
