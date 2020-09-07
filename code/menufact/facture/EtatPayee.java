package menufact.facture;

public class EtatPayee implements EtatFacture
{
    private Facture facture;

    @Override
    public String toString()
    {
        return "EtatPayee";
    }

    public void setFacture(Facture factureAssociee)
    {
        facture = factureAssociee;
    }

    public void ouvrir() { }

    public void fermer() { }

    public void payer() { }

    public String genererFacture()
    {
        return facture.ecrireFacture();
    }
}
