package menufact;

import menufact.plats.PlatChoisi;

public class Chef implements Cuisinier
{
    String nom;

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
