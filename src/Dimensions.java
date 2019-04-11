
public class Dimensions {
	
	private double length;
	private double width;
	
	public Dimensions(double length, double width) {
		this.length = length;
		if(length <= 0) {
			this.length = 1;
		}
		this.width = width;
		if(width <= 0) {
			this.width = 1;
		}
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

}
