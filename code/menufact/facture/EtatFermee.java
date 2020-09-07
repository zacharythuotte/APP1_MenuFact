package menufact.facture;

public class EtatFermee implements EtatFacture
{
    private Facture facture;

    @Override
    public String toString()
    {
        return "EtatFermee";
    }

    public void setFacture(Facture factureAssociee)
    {
        facture = factureAssociee;
    }

    public void ouvrir()
    {
        EtatOuverte nouvelEtat = new EtatOuverte();
        nouvelEtat.setFacture(facture);
        facture.changeEtat(nouvelEtat);
    }

    public void fermer() { }

    public void payer()
    {
        EtatPayee nouvelEtat = new EtatPayee();
        nouvelEtat.setFacture(facture);
        facture.changeEtat(nouvelEtat);
    }

    public Boolean peutAjouter()
    {
        return Boolean.FALSE;
    }

    public String genererFacture()
    {
        return facture.ecrireFacture();
    }
}
