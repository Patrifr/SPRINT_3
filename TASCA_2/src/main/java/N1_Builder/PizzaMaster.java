package N1_Builder;

import N1_Builder.PizzaBuilder.PizzaBuilder;
import N1_Builder.Types.Dough;
import N1_Builder.Types.Size;

public class PizzaMaster {

    public void makeHawaiianPizza(PizzaBuilder pb){
        pb.setPizzaSize(Size.SMALL);
        pb.setPizzaDough(Dough.GLUTEN_FREE);
        pb.setPizzaToppings("Pineapple");
        pb.setPizzaToppings("Mozzarella");
        pb.setPizzaToppings("Tomato");
    }
    public void makeBbqPizza(PizzaBuilder pb){
        pb.setPizzaSize(Size.LARGE);
        pb.setPizzaDough(Dough.ROMAN);
        pb.setPizzaToppings("Onion");
        pb.setPizzaToppings("Cheddar");
        pb.setPizzaToppings("Bacon");
        pb.setPizzaToppings("Bbq Sauce");
    }

    public void makeCarbonaraPizza(PizzaBuilder pb){
        pb.setPizzaSize(Size.MEDIUM);
        pb.setPizzaDough(Dough.NEAPOLITAN);
        pb.setPizzaToppings("Onion");
        pb.setPizzaToppings("Mushroom");
        pb.setPizzaToppings("Parmesan cheese");
        pb.setPizzaToppings("Cream");
        pb.setPizzaToppings("Bacon");
        pb.setPizzaToppings("Egg");
    }
}
