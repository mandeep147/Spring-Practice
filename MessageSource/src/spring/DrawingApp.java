package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class DrawingApp {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shapes shape = (Shapes) context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting", null, "Default Greeting!", null));
	}
}
