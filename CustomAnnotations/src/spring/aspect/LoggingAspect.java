package spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void logAspect(JoinPoint joinPoint){
	//	System.out.println("Get method called");
	}
	
	@After("args(name)")
	public void stringValue(String name){
		System.out.println("value of string is: " +name);
	}
	
	/*create a new annotation by right click-->new--->annotation 
	 *  use it anywhere in the code you want to use the annotation
	 */	
	@Around("@annotation(spring.aspect.Loggable)")
	public void aroundAdvice(ProceedingJoinPoint proceed){
		try {
			System.out.println("before advice");
			proceed.proceed();
			System.out.println("after return");
		} catch (Throwable e) {
			System.out.println("after throwing exception");
		}
		System.out.println("after finally");
	}
	
	@Pointcut("execution(* get*())")
	public void pointcutAspect(){}
	
	@Pointcut("within(spring.model.Circle)")
	public void allCircleMethods(){}
}