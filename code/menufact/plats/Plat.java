package menufact.plats;

import ingredients.Ingredient;

import java.util.ArrayList;

public interface Plat
{
    public ArrayList<Ingredient> getIngredients();

    public void addIngredient(Ingredient nouvelIngredient);

    @Override
    public String toString();

    public int getCode();

    public void setCode(int code);

    public String getDescription();

    public void setDescription(String description);

    public double getPrix();

    public void setPrix(double prix);
}
