package N1_Builder.PizzaBuilder;

import N1_Builder.Types.Dough;
import N1_Builder.Types.Size;

public interface PizzaBuilder {
    void setPizzaSize(Size size);
    void setPizzaDough(Dough dough);
    void setPizzaToppings(String topping);
}
