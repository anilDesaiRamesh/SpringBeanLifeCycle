/**
 * 
 */
package com.anil.lifecycle.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.anil.lifecycle.services.LifeCycleDemoBean;

/**
 * @author Anil_Ramesh
 *
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	public CustomBeanPostProcessor() {
		super();
		System.out.println("#####I'm inside CustomBeanPostProcessor constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).beforeInit();
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).afterInit();
		}
		return bean;
	}

}
