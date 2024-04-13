package org.examples.ioc;

import java.util.HashMap;
import java.util.Map;

public class IocContainer {

	Map<Class,Object> objectsContainer = new HashMap<>();

	void init(Object[] properties){
		objectsContainer.put(BazaDanych.class, new BazaDanych(properties));
		
		objectsContainer.put(ReadingService.class, new ReadingService(
				this.getBean(BazaDanych.class)
		));
		
		ReadingRestController readingRestController = new ReadingRestController(
				this.getBean(ReadingService.class)
		);
		
		objectsContainer.put(ReadingRestController.class, readingRestController);
	}

	public <T> T getBean(Class<T> beanClass){
		return ((T) objectsContainer.get(beanClass));
	}
}
