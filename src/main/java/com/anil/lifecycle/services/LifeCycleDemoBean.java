/**
 * 
 */
package com.anil.lifecycle.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Anil_Ramesh
 *
 */
@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		super();
		System.out.println("## I'm in the LifeCycleDemoBean Constructor");
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.context.ApplicationContextAware#setApplicationContext(org
	 * .springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("## Application context has been set");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.
	 * springframework.beans.factory.BeanFactory)
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("## Bean Factory has been set");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	 */
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("## My Bean Name is : " + name);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("## The lifecycle bean has been terminated");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("## The lifecyclebean has its properties set");

	}

	@PostConstruct
	public void postConstruct() {

		System.out.println("## The post construct annotated method has been called");

	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("## The predestroy annotated method has been called");
	}

	public void beforeInit() {
		System.out.println("## Before init - called by bean post processor");
	}

	public void afterInit() {
		System.out.println("## After init-called by bean post processor");
	}
}
