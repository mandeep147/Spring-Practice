package spring;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable bean--destroy method called");
	}
}