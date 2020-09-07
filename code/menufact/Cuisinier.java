package menufact;

import menufact.plats.PlatChoisi;

public interface Cuisinier
{
    public void avertir(PlatChoisi platACuisiner);

    @Override
    public String toString();
}
