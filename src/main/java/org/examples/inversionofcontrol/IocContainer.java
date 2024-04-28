package org.examples.inversionofcontrol;

import java.util.HashMap;
import java.util.Map;

public class IocContainer {

	Map<Class,Object> objectsContainer = new HashMap<>();

	void init(Object[] properties){
		prepareReadingRestController(properties);
	}

	private void prepareReadingRestController(Object[] properties) {
		objectsContainer.put(DatabaseSQL.class, new DatabaseSQL(properties));

		objectsContainer.put(ReadingService.class, new ReadingService(
				this.getBean(DatabaseSQL.class)
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
