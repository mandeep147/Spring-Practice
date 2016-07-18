package spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void logAspect(JoinPoint joinPoint){
	//	System.out.println("Get method called");
	}
	
	//after method runs even if run fails this will be executed
	@After("args(name)")
	public void stringValue(String name){
		System.out.println("value of string is: " +name);
	}
	
	@Pointcut("execution(* get*())")
	public void pointcutAspect(){}
	
	@Pointcut("within(spring.model.Circle)")
	public void allCircleMethods(){}
}