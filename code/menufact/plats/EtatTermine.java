package menufact.plats;

public class EtatTermine implements EtatPlat
{
    private PlatChoisi platChoisi;

    /**
     * Constructeur de la classe
     * @param platChoisiAssocie
     */
    public EtatTermine(PlatChoisi platChoisiAssocie)
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
    public void setEtat(EtatPlat nouvelEtat)
    {
        platChoisi.etat = nouvelEtat;
    }

    @Override
    public String toString()
    {
        return "EtatTermine";
    }
}
