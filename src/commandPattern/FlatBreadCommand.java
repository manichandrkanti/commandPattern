package commandPattern;

public class FlatBreadCommand {

	public static void main(String[] args) {
		Bread bread = new Bread();

		PurchaseBread truck = new PurchaseBread(bread);
		DeliverBread sendTruck = new DeliverBread(bread);

		CampbellFactory CampbellFactory = new CampbellFactory();
		CampbellFactory.placeOrder(truck);
		CampbellFactory.placeOrder(sendTruck);
		
		CampbellFactory.executeOrders();

	}

}
