package menufact.plats;

import menufact.plats.PlatAuMenu;

public class PlatChoisi
{
    private Plat plat;
    private int quantite;

    protected EtatPlat etat;

    public PlatChoisi(Plat plat, int quantite)
    {
        this.plat = plat;
        this.quantite = quantite;
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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Plat getPlat() {
        return plat;
    }

    public void setEtat(EtatPlat nouvelEtat)
    {
        etat.setEtat(nouvelEtat);
    }
}