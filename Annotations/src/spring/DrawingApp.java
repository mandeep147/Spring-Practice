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
		Shapes shape1 = (Shapes) context.getBean("circle");
		shape1.draw();
	}
}
