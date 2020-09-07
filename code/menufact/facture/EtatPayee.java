package menufact.facture;

import menufact.facture.exceptions.FactureException;

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

    public void ouvrir() //throws FactureException
    {
//        throw new FactureException("La facture ne peut pas être reouverte.");
    }

    public void fermer() { }

    public void payer() { }

    public Boolean peutAjouter()
    {
        return Boolean.FALSE;
    }

    public String genererFacture()
    {
        return facture.ecrireFacture();
    }
}
