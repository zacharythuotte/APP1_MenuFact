package menufact.plats;

public class EtatServi
{
    private PlatChoisi platChoisi;

    public EtatServi(PlatChoisi platChoisiAssocie)
    {
        platChoisi = platChoisiAssocie;
    }

    public void setEtat(EtatPlat nouvelEtat)
    {
        platChoisi.etat = nouvelEtat;
    }

    @Override
    public String toString()
    {
        return "EtatServi";
    }
}
