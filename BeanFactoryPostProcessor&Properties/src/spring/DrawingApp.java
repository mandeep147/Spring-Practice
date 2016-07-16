/**
 * bean factory post processor 
 * using properties file to assign the values to points
 * to avoid hard coding the values in XML file 
 */
package spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class DrawingApp {
	public static void main(String []args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle"); 	
		triangle.draw();		
	}
}
