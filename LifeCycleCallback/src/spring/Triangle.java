package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw(){
		System.out.println(getPointA().getX()+ " : "+getPointA().getY());
		System.out.println(getPointB().getX()+ " : "+getPointB().getY());
		System.out.println(getPointC().getX()+ " : "+getPointC().getY());
	}

	public void myinit(){
		System.out.println("Inside init method");
	}
	public void cleanUp(){
		System.out.println("Inside destroy method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Spring destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Spring init");
		
	}}