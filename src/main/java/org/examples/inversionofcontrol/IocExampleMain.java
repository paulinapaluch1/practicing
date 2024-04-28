package org.examples.inversionofcontrol;

public class IocExampleMain {

	public static void main(String[] args) {
		caseWithIoc(args);
		caseWithoutIoc(args);
	}

	private static void caseWithIoc(Object[] properties) {
		ReadingRestController controller = new ReadingRestController(properties);
		controller.readBook();
	}

	private static void caseWithoutIoc(Object[] properties) {
		IocContainer iocContainer = new IocContainer();
		iocContainer.init(properties);
		
		ReadingRestController restController = iocContainer.getBean(ReadingRestController.class);
		restController.readBook();
	}

}
