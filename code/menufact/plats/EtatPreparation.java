package menufact.plats;

public class EtatPreparation implements EtatPlat
{
    private PlatChoisi platChoisi;

    public EtatPreparation(PlatChoisi platChoisiAssocie)
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

    public void setEtat(EtatPlat nouvelEtat)
    {
        platChoisi.etat = nouvelEtat;
    }

    @Override
    public String toString()
    {
        return "EtatPreparation";
    }
}
