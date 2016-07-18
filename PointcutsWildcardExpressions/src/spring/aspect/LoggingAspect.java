package spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	//aspect before execution of any getName method
	@Before("execution(public String getName())")
	public void logg(){
		System.out.println("Aspect executed. Get Method is called");
	}
	
	//aspect exclusive for one class
	@Before("execution(public String spring.model.Circle.getName())")
	public void logCircle(){
		System.out.println("Advice executed for circle class");
	}
	
	//for every getter method
	//it will be executed twice as in SpringAop two getter methods are called.. getCircle and getName
	@Before("execution(* get*())")
	public void expr(){
		System.out.println("Getters method called");
	}
	
	//for every public getter method
	@Before("execution(public * get*())")
	public void publlicGet(){
		System.out.println("public getter method is called");
	}
	
	//to match the arguments--> .. stands for 0 or more args
	@Before("execution ( * get*(..))")
	public void matchArgs(){
		System.out.println("matching arguments");
	}
}
