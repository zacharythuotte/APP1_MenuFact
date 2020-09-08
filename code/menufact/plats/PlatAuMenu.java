package menufact.plats;

import ingredients.Ingredient;

import java.util.ArrayList;

public class PlatAuMenu implements Plat
{
    private int code;
    private String description;
    private double prix;
    private ArrayList<Ingredient> ingredients;

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.ingredients = new ArrayList<Ingredient>();
    }

    public PlatAuMenu() {
    }

    public ArrayList<Ingredient> getIngredients()
    {
        return ingredients;
    }

    public void addIngredient(Ingredient nouvelIngredient)
    {
        ingredients.add(nouvelIngredient);
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
