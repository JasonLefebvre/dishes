package fr.jason;

import java.util.ArrayList;

public class Dish {

    private String name;

    private ArrayList<Ingredient> ingredients;

    public Dish(String name, ArrayList<Ingredient> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dish d)){
            return false;
        }
        return d.getIngredients() == this.getIngredients();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}
