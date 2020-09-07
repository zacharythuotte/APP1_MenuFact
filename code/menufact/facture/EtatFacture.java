package menufact.facture;

public interface EtatFacture
{
    public void setFacture(Facture factureAssociee);

    public void ouvrir();
    public void fermer();
    public void payer();

    @Override
    public String toString();

    public String genererFacture();
}
