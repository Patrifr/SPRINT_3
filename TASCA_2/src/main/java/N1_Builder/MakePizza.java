package N1_Builder;

import N1_Builder.PizzaBuilder.Pizza;
import N1_Builder.PizzaBuilder.PizzaBbq;
import N1_Builder.PizzaBuilder.PizzaCarbonara;
import N1_Builder.PizzaBuilder.PizzaHawaiian;

public class MakePizza {
    public static void start(){
        PizzaMaster pizzaMaster = new PizzaMaster();

        PizzaHawaiian buildHawaiianPizza = new PizzaHawaiian();
        pizzaMaster.makeHawaiianPizza(buildHawaiianPizza);
        Pizza hawaiianPizza= buildHawaiianPizza.getPizza();
        System.out.println("Hawaiian Pizza.\n" + hawaiianPizza.toString());

        PizzaBbq buildBbqPizza = new PizzaBbq();
        pizzaMaster.makeBbqPizza(buildBbqPizza);
        Pizza bbqPizza= buildBbqPizza.getPizza();
        System.out.println("BBQ Pizza.\n" + bbqPizza.toString());

        PizzaCarbonara buildPizzaCarbonara = new PizzaCarbonara();
        pizzaMaster.makeCarbonaraPizza(buildPizzaCarbonara);
        Pizza carbonaraPizza = buildPizzaCarbonara.getPizza();
        System.out.println("Carbonara Pizza:\n" + carbonaraPizza.toString());
    }
}
