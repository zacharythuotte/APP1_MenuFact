package menufact.plats;

public class CreateurPlatEnfant extends CreateurPlatAuMenu
{
    @Override
    protected Plat creerPlat()
    {
        return new PlatEnfant();
    }
}
