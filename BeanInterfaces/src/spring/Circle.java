package spring;

public class Circle implements Shapes {
	private Point center;
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw(){
		System.out.println("Drawing Circle");
		System.out.println("Point: (" +center.getX() + "," + center.getY() +")");
	}
}
