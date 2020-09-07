package menufact.facture;

public class EtatOuverte implements EtatFacture
{
    private Facture facture;
//    private FactureEtat etat;

//    public void EtatOuverte()
//    {
//        Facture.setEtat(FactureEtat.OUVERTE);
//    }

    @Override
    public String toString() { return "EtatOuverte"; }

    public void setFacture(Facture factureAssociee)
    {
        facture = factureAssociee;
    }

    public void ouvrir() { }

    public void fermer()
    {
        EtatFermee nouvelEtat = new EtatFermee();
        nouvelEtat.setFacture(facture);
        facture.changeEtat(nouvelEtat);
    }

    public void payer()
    {
        EtatPayee nouvelEtat = new EtatPayee();
        nouvelEtat.setFacture(facture);
        facture.changeEtat(nouvelEtat);
    }

    public Boolean peutAjouter()
    {
        return Boolean.TRUE;
    }

    public String genererFacture()
    {
        //Lancer exception plutot
        return "La facture est encore ouverte";
    }
}
