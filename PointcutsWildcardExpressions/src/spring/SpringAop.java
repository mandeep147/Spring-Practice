package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.ShapeService;

public class SpringAop {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shape = context.getBean("shapeService", ShapeService.class);
		System.out.println(shape.getCircle().getName());
	}

}
