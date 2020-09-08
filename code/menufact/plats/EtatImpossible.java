package menufact.plats;

public class EtatImpossible
{
    private PlatChoisi platChoisi;

    public EtatImpossible(PlatChoisi platChoisiAssocie)
    {
        platChoisi = platChoisiAssocie;
    }

    public void setEtat(EtatPlat nouvelEtat)
    {
        platChoisi.etat = nouvelEtat;
    }
}
