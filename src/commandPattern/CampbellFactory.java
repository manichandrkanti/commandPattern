package commandPattern;
import java.util.ArrayList;
import java.util.List;

public class CampbellFactory {
	private List<Order> cart = new ArrayList<Order>();


	public void placeOrder(Order order) {
		cart.add(order);
	}

	public void executeOrders() {
		for (Order order : cart) {
			order.execute();
		}
		cart.clear();
	}
}
