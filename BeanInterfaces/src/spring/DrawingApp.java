//referring bean property to another properties
package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/* normal method
		 * Triangle triangle  = (Triangle) context.getBean("triangle"); 	
		 * triangle.draw();
		 * Circle circle = (Circle) context.getBean("circle");
		 * circle.draw();
		 **/
		//coding to interfaces
		Shapes shape = (Shapes) context.getBean("triangle");
		shape.draw();
		Shapes shape1 = (Shapes) context.getBean("circle");
		shape1.draw();
	}
}
