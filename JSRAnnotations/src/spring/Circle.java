package spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shapes {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
//	@Resource(name = "pointB")
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw(){
		System.out.println("Drawing Circle");
		System.out.println("Point: (" +center.getX() + "," + center.getY() +")");
	}
	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Initialize circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy Circle");
	}
}
