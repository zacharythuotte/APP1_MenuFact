package menufact.plats;

public interface EtatPlat
{

    public void setPlatChoisi(PlatChoisi platChoisiAssocie);

    public void prochainEtat();

    public void setEtat(EtatPlat nouvelEtat);
}
