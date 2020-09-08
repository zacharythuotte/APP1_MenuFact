package menufact;

import menufact.plats.PlatChoisi;

public class Chef implements Cuisinier
{
    String nom;

    /**
     * Constructeur de chef
     * @param nouveauNom
     */
    public Chef(String nouveauNom)
    {
        nom = nouveauNom;
    }

    /**
     *
     * @param platACuisiner
     */
    public void avertir(PlatChoisi platACuisiner)
    {
        System.out.println("Le chef " + this.toString() + " est avertit de cuisiner le plat choisi suivant :" + platACuisiner.toString());
    }

    @Override
    public String toString()
    {
        return nom;
    }
}
