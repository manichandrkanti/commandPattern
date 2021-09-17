package commandPattern;

public class Bread {
	private String breadType = "flat bread";
	private int breadNumber = 1000;


	public void purchaseBread() {
		System.out.println("The type of Bread - " + breadType + "  The Quantity of bread - " + breadNumber +" purchased from manufacturer");
	}

	public void deliverBread() {
		System.out.println("The type of Bread - " + breadType + "  The Quantity of bread - " + breadNumber +" delivered to the customer");
	}
}
