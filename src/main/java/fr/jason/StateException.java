package fr.jason;

public class StateException extends Exception{

    private State state;
    private Ingredient ingredient;

    public StateException(Ingredient ingredient, State state){
        super("L'état de <" + ingredient.getName() + "> n'est pas bon : " + state);
    }
}
