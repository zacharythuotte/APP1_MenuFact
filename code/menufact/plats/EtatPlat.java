package menufact.plats;

public interface EtatPlat
{
    /**
     * Methode pour changer l etat du plat choisi associe
     * @param nouvelEtat
     */
    public void setEtat(EtatPlat nouvelEtat);

    /**
     * Methode pour definir le plat choisi associe a cet etat
     * @param c
     */
    public void setPlatChoisi(PlatChoisi c);

    public String toString();
}
