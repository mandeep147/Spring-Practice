//instead of re-writing whole expression again and again use pointcuts
package spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("pointcutAspect() && allCircleMethods()")
	public void logAspect(){
		System.out.println("Getters method called");
	}
	
	@Before("pointcutAspect()")
	public void secondAspect(){
		System.out.println("second advice is called");
	}
	
	@Pointcut("execution(* get*())")
	public void pointcutAspect(){}
	
//	@Pointcut("execution(* * spring.model.Circle.*(..))")
// or
// within takes class name as parameter whereas execution takes method name as argument
	@Pointcut("within(spring.model.Circle)")
	public void allCircleMethods(){}

		
}
