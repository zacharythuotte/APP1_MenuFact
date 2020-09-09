package menufact.plats;

public class EtatImpossible implements EtatPlat
{
    private PlatChoisi platChoisi;

    /**
     * Constructeur de la classe
     * @param platChoisiAssocie
     */
    public EtatImpossible(PlatChoisi platChoisiAssocie)
    {
        platChoisi = platChoisiAssocie;
    }

    /**
     * Methode pour definir le plat choisi associe a cet etat
     * @param c
     */
    public void setPlatChoisi(PlatChoisi c)
    {
        platChoisi = c;
    }

    /**
     * Methode pour changer l etat du plat choisi associe
     * @param nouvelEtat
     */
    @Override
    public void setEtat(EtatPlat nouvelEtat)
    {
        platChoisi.etat = nouvelEtat;
    }

    @Override
    public String toString()
    {
        return "EtatImpossible";
    }
}
