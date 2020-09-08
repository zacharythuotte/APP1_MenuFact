package menufact.plats;

public class EtatPreparation
{
    private PlatChoisi platChoisi;

    public EtatPreparation(PlatChoisi platChoisiAssocie)
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
        return "EtatPreparation";
    }
}
