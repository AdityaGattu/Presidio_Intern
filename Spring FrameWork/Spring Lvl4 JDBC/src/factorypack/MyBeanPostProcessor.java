package factorypack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("post process after init called..."+name);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("post process before init called...."+name);
		return bean;
	}
	
}
