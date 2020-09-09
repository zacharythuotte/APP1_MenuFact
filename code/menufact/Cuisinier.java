package menufact;

import menufact.plats.PlatChoisi;

public interface Cuisinier
{
    /**
     * avertis un cuisinier qu il y a un plat a preparer
     * @param platACuisiner
     */
    public void avertir(PlatChoisi platACuisiner);

    /**
     * fonction que affiche les iinfo a l ecran
     * @return
     */
    @Override
    public String toString();
}
