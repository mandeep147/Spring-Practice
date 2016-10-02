package greeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Greeter greet = (Greeter) context.getBean("greeter");
		System.out.println(greet.getGreeting());
	}
}