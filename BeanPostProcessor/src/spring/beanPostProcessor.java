package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class beanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		System.out.println("After initializing bean " +name);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		System.out.println("Before initializing bean " +name);
		return bean;
	}

}
