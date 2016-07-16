package spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Depending on role of bean
//@Service
//@Repository //if class is data
//@Controller //c of MVC 
@Component
public class Circle implements Shapes {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
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
