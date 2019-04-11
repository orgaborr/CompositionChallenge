
public class Furniture extends Dimensions {
	
	//x and y are the coordinates of the lower right corner of the object
	private double x;
	private double y;
	
	public Furniture(double length, double width, double x, double y) {
		super(length, width);
		this.x = x;
		if(x < 0) {
			this.x = 0;
		}
		this.y = y;
		if(y < 0) {
			this.y = 0;
		}
 	}

}
