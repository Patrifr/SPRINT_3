package N1_Builder.PizzaBuilder;

import N1_Builder.Types.Dough;
import N1_Builder.Types.Size;

public class PizzaBbq implements PizzaBuilder {

    private Pizza pizza = new Pizza();

    @Override
    public void setPizzaSize(Size size) {
        pizza.setSize(size);
    }

    @Override
    public void setPizzaDough(Dough dough) {
        pizza.setDough(dough);
    }

    @Override
    public void setPizzaToppings(String topping) {
        pizza.addToppings(topping);
    }

    public Pizza getPizza(){
        return pizza;
    }
}
