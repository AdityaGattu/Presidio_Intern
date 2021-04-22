package factorypack;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ThankyouAdvice implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object bean, Method method, Object[] arguments, Object mreturn) throws Throwable {
		Customer customer=(Customer)arguments[0];
		String name=customer.getName();
		System.out.println("Thankyou ...:"+name+" visit again....");
	}
}
