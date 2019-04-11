
public class Couch extends Furniture{
	
	private boolean canOpen;
	private double openLength;
	
	public Couch(double length, double width, double x, double y, boolean canOpen, double openLength) {
		super(length, width, x, y);
		this.canOpen = canOpen;
		this.openLength = openLength;
		if(openLength <= length) {
			canOpen = false;
		}
	}

	public boolean isCanOpen() {
		return canOpen;
	}
	
	public double getOpenLength() {
		return openLength;
	}
	
	public void openCouch() {
		if(canOpen) {
			setLength(openLength);
		} else {
			System.out.println("This type of couch does not open");
		}
	}
}
