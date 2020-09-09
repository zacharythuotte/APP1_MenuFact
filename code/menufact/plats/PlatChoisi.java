package menufact.plats;

import menufact.plats.PlatAuMenu;

public class PlatChoisi
{
    private Plat plat;
    private int quantite;

    protected EtatPlat etat;

    /**
     * Constructeur
     * @param plat
     * @param quantite
     */
    public PlatChoisi(Plat plat, int quantite)
    {
        this.plat = plat;
        this.quantite = quantite;
        this.etat = new EtatPreparation(this);
    }

    @Override
    public String toString()
    {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                ", etat=" + etat +
                '}';
    }

    /**
     * Methode pour obtenir le nombre de plats
     * @return
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Methode pour definir le nombre de plats
     * @param quantite
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * Methode pour obtenir l etat actuel du plat
     * @return
     */
    public Plat getPlat() {
        return plat;
    }

    /**
     * Methode pour definir l etat du plat
     * @param nouvelEtat
     */
    public void setEtat(EtatPlat nouvelEtat)
    {
        //nouvelEtat.setPlatChoisi(this);
        etat.setEtat(nouvelEtat);
    }
}