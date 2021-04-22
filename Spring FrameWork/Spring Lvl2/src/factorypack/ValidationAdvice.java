package factorypack;

import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ValidationAdvice implements MethodInterceptor {
	List<Customer> list=new ArrayList<Customer>();
@Override
public Object invoke(MethodInvocation mi) throws Throwable {
	Customer customer=(Customer)mi.getArguments()[0];
	if(list.contains(customer)) {
		throw new ShoeException("Only one shoe per customer....");
	}
	else {
		list.add(customer);
	}
	Object obj=mi.proceed();
	return obj;
}
}
