package menufact.facture;

import menufact.Client;
import menufact.Cuisinier;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.Date;

/**
 * Une facture du systeme Menufact
 * @author Domingo Palao Munoz
 * @version 1.0
 */
public class Facture
{
    private Date date;
    private String description;
    private EtatFacture etat;

    private ArrayList<PlatChoisi> platchoisi = new ArrayList<PlatChoisi>();
    private int courant;
    private Client client;

    private ArrayList<Cuisinier> chefs = new ArrayList<Cuisinier>();

    /**********************Constantes ************/
    private final double TPS = 0.05;
    private final double TVQ = 0.095;

    /**
     *
     * @param client le client de la facture
     */
    public void associerClient (Client client)
    {
        this.client = client;
    }

    /**
     * Calcul du sous total de la facture
     * @return le sous total
     */
    public double sousTotal()
    {
        double soustotal=0;
         for (PlatChoisi p : platchoisi)
             soustotal += p.getQuantite() * p.getPlat().getPrix();
        return soustotal;
    }

    /**
     *
     * @return le total de la facture
     */
    public double total(){
        return sousTotal()+tps()+tvq();
    }

    /**
     *
     * @return la valeur de la TPS
     */
    private double tps(){
        return TPS*sousTotal();
    }

    /**
     *
     * @return la valeur de la TVQ
     */
    private double tvq(){
        return TVQ*(TPS+1)*sousTotal();
    }

    /**
     * Permet de chager l'état de la facture à PAYEE
     */
    public void payer()
    {
        etat.payer();
//       etat = new EtatPayee();
    }
    /**
     * Permet de chager l'état de la facture à FERMEE
     */
    public void fermer()
    {
        etat.fermer();
//       etat = new EtatFermee();
    }

    /**
     * Permet de changer l'état de la facture à OUVERTE
     * @throws FactureException en cas que la facture soit PAYEE
     */
    public void ouvrir() throws FactureException
    {
        etat.ouvrir();

//        if (etat instanceof EtatPayee)
//            throw new FactureException("La facture ne peut pas être reouverte.");
//        else
//            etat = new EtatOuverte();
    }

    /**
     * Permet de changer l etat de la facture
     * @param nouvelEtat
     */
    public void changeEtat(EtatFacture nouvelEtat)
    {
        etat = nouvelEtat;
        nouvelEtat.setFacture(this);
    }

    /**
     *
     * @return l'état de la facture
     */
    public EtatFacture getEtat()
    {
        return etat;
    }

    /**
     * constructeur
     * @param description la description de la Facture
     */
    public Facture(String description)
    {
        date = new Date();

        EtatOuverte etatInitial = new EtatOuverte();
        etatInitial.setFacture(this);
        etat = etatInitial;

        courant = -1;
        this.description = description;
    }

    /**
     *Methode pour ajouter un plat choisi a la liste de plats
     * @param p un plat choisi
     * @throws FactureException Seulement si la facture est OUVERTE
     */
    public void ajoutePlat(PlatChoisi p) throws FactureException
    {
        if (etat.peutAjouter() == Boolean.TRUE)
            platchoisi.add(p);
        else
            throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
    }

    /**
     * Methode pour ajouter un cuisinier a la liste de cuisiniers
     * @param cuisinierAAjouter
     */
    public void ajouterCuisinier(Cuisinier cuisinierAAjouter)
    {
        chefs.add(cuisinierAAjouter);

        System.out.println("Le chef " + cuisinierAAjouter + " est ajoute a la liste des cuisiniers de la facture");
    }

    /**
     * Methode pour retirer un cuisinier de la liste de cuisiniers
     * @param cuisinierARetirer
     */
    public void retirerCuisinier(Cuisinier cuisinierARetirer)
    {
        chefs.remove(cuisinierARetirer);

        System.out.println("Le chef " + cuisinierARetirer + " est retire de la liste des cuisiniers de la facture");
    }

    /**
     * Methode pour avertir chacun des chefs cuisiniers de preparer un plat choisi
     * @param platACuisiner
     * @throws FactureException
     */
    public void avertirCuisiniers(PlatChoisi platACuisiner) throws FactureException
    {
        //Exception si aucun cuisiner n est ajoute

        if(chefs.size() <= 0)
        {
            throw new FactureException("Il n y a aucun chef a avertir dans la liste des chefs de cette facture.");
        }

        for (int i = 0; i < chefs.size(); i++)
        {
            chefs.get(i).avertir(platACuisiner);
        }
    }

    /**
     *
     * @return le contenu de la facture en chaîne de caracteres
     */
    @Override
    public String toString()
    {
        return "menufact.facture.Facture{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", etat=" + etat +
                ", platchoisi=" + platchoisi +
                ", courant=" + courant +
                ", client=" + client +
                ", TPS=" + TPS +
                ", TVQ=" + TVQ +
                '}';
    }

    /**
     *
     * @return une chaîne de caractères avec la facture à imprimer
     */
    public String genererFacture()
    {
        return etat.genererFacture();
    }

    /**
     *
     * @return une facture bien decrie et formattee
     */
    protected String ecrireFacture()
    {
        String lesPlats = new String();
        String factureGenere = new String();

        int i =1;

        factureGenere =   "Facture generee.\n" +
                "Date:" + date + "\n" +
                "Description: " + description + "\n" +
                "Client:" + client.getNom() + "\n" +
                "Les plats commandes:" + "\n" + lesPlats;

        factureGenere += "Seq   Plat         Prix   Quantite\n";
        for (PlatChoisi plat : platchoisi)
        {
            factureGenere +=  i + "     " + plat.getPlat().getDescription() +  "  " + plat.getPlat().getPrix() +  "      " + plat.getQuantite() + "\n";
            i++;
        }

        factureGenere += "          TPS:               " + tps() + "\n";
        factureGenere += "          TVQ:               " + tvq() + "\n";
        factureGenere += "          Le total est de:   " + total() + "\n";

        return factureGenere;
    }
}
