package menufact.plats;

public class CreateurPlatSante extends CreateurPlatAuMenu
{
    @Override
    public Plat creerPlat()
    {
        return new PlatSante();
    }
}
