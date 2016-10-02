package spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public void logAspect(JoinPoint joinPoint){
		System.out.println("Get method called");
	}
	
	public void stringValue(String name){
		System.out.println("value of string is: " +name);
	}
	
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
	
}