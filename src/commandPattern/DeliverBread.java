package commandPattern;

public class DeliverBread implements Order {

	private Bread bread;

	public DeliverBread(Bread bread) {
		this.bread   = bread;
	}
	@Override
	public void execute() {
		bread.deliverBread();

	}

}
