package commandPattern;

public class PurchaseBread implements Order {
	private Bread bread;

	public PurchaseBread(Bread bread) {
		this.bread = bread;
	}

	@Override
	public void execute() {
		bread.purchaseBread();

	}

}
