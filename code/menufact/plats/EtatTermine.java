package menufact.plats;

public class EtatTermine
{
    private PlatChoisi platChoisi;

    public EtatTermine(PlatChoisi platChoisiAssocie)
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
        return "EtatTermine";
    }
}
