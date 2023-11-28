package Pizza_Example;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("First order was a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Second order was a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Third order was a " + pizza.getName() + "\n");
	}
}