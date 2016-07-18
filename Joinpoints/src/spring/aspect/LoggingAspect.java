package spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	//joinPoints are only for methods
	@Before("allCircleMethods()")
	public void logAspect(JoinPoint joinPoint){
		//System.out.println("Get method called");
		System.out.println(joinPoint.toString());
		System.out.println("target is: " +joinPoint.getTarget());
	}
	
	@Before("args(String)")
	public void stringArgs(){
		System.out.println("methods taking string args is called");
	}
	
	@Before("args(name)")
	public void stringValue(String name){
		System.out.println("value of string is: " +name);
	}
	
	@Pointcut("execution(* get*())")
	public void pointcutAspect(){}
	
	@Pointcut("within(spring.model.Circle)")
	public void allCircleMethods(){}
}