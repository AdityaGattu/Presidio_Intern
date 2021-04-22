package factorypack;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class WelcomeAdvice implements MethodBeforeAdvice{
	
	@Override
	public void before(Method method, Object[] arguments, Object bean) throws Throwable {
		Customer customer=(Customer)arguments[0];
		System.out.println("Welcome to my shoe shop....:"+customer.getName());
	}
}


