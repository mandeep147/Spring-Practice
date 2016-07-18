package spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(public String getName())")
	public void logg(){
		System.out.println("Aspect executed.");
	}
}
