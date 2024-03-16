package fr.jason;

public class Main {
    public static void main(String[] args) {

        Ingredient saucisse = new Ingredient("Saucisse", State.RAW, null, 1);
        Ingredient oignon = new Ingredient("Oignon", State.WHOLE, null, 1);

        System.out.println(saucisse.getState());
        saucisse.cook();
        System.out.println(saucisse.getState());

        System.out.println(oignon.getState());
        oignon.cut();
        System.out.println(oignon.getState());

    }
}