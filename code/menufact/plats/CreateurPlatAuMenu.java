package menufact.plats;

public class CreateurPlatAuMenu
{
    public Plat creerPlatMenu(int code, String description, double prix)
    {
        return new PlatAuMenu(code, description, prix);
    }

    public Plat creerPlatAuMenu()
    {
        return new PlatAuMenu();
    }

    public Plat creerPlatSante(int code, String description, double prix, double kcal, double chol, double gras)
    {
        return new PlatSante(code, description, prix, kcal, chol, gras);
    }

    public Plat creerPlatSante()
    {
        return new PlatSante();
    }

    public Plat creerPlatEnfant(int code, String description, double prix, double proportion)
    {
        return new PlatEnfant(code, description, prix, proportion);
    }

    public Plat creerPlatEnfant()
    {
        return new PlatEnfant();
    }
}
