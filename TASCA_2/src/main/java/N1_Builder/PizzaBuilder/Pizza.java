package N1_Builder.PizzaBuilder;

import N1_Builder.Types.Dough;
import N1_Builder.Types.Size;

import java.util.ArrayList;

public class Pizza {
    private Size size;
    private Dough dough;
    private ArrayList<String> toppings;

    public Pizza(){
        this.toppings = new ArrayList<>();
    }

    public Size getSize() {
        return size;
    }
    public Dough getDough() {
        return dough;
    }
    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addToppings(String topping) {
        this.toppings.add(topping);
    }
    public String listToppings(){
        String list = "";
        for(String topping : this.toppings){
            list += "- " + topping + "\n";
        }
        return list;
    }

    @Override
    public String toString() {
        return "Size: " + this.getSize() + "\nDough: " + this.getDough() + "\nToppings:\n" + listToppings();
    }
}


