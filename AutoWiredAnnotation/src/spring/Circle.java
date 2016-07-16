package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shapes {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Autowired
	@Qualifier("circle")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw(){
		System.out.println("Drawing Circle");
		System.out.println("Point: (" +center.getX() + "," + center.getY() +")");
	}
}
