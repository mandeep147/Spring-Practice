package spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void logAspect(JoinPoint joinPoint){
		System.out.println("Get method called");
	}
	
	@AfterReturning("args(name)")
	public void afterReturn(String name){
		System.out.println("after returning exception " +name);
	}
	
	//to access the value returned by target method
	//to access the argument of any type, we can specify Object instead of String and cast the value while using it
	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringReturnArgs(String name, String returnString){
		System.out.println("after return: " +name + "value is: " +returnString);
	}
	
	@AfterThrowing("args(name)")
	public void afterThrow(String name){
		System.out.println("after throwing exception " +name);
	}
	
	//to catch the exception
	@AfterThrowing(pointcut = "args(name)", throwing = "except")
	public void afterThrowExcept(String name, Exception except){
		System.out.println("after throwing exception " +name+ "\n Exceptionn is: " +except.toString());
	}
	
	@Pointcut("execution(* get*())")
	public void pointcutAspect(){}
	
	@Pointcut("within(spring.model.Circle)")
	public void allCircleMethods(){}
}