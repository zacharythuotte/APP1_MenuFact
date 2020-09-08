package menufact.plats;

public class EtatCommande implements EtatPlat
{
    private PlatChoisi platChoisi;

    public EtatCommande(PlatChoisi platChoisiAssocie)
    {
        platChoisi = platChoisiAssocie;
    }

    public void setEtat(EtatPlat nouvelEtat)
    {
        platChoisi.etat = nouvelEtat;
    }
}
