package menufact;

import menufact.plats.PlatChoisi;

public interface Cuisinier
{
    /**
     * Methode qui avertit le cuisinier qu un nouveau plat doit etre prepare
     * @param platACuisiner
     */
    public void avertir(PlatChoisi platACuisiner);

    @Override
    public String toString();
}
