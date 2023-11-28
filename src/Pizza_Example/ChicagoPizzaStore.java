package Pizza_Example;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		
		else if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}
			
		return pizza;
	}
}