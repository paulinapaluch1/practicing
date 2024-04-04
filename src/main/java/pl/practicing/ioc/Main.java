package pl.practicing.ioc;

public class Main {

	public static void main(String[] args) {
		before(args);
		after(args);
	}

	private static void before(Object[] properties) {
		ReadingRestController controller = new ReadingRestController(properties);
		controller.readBook();
	}

	private static void after(Object[] properties) {
		IocContainer iocContainer = new IocContainer();
		iocContainer.init(properties);
		
		ReadingRestController restController = iocContainer.getBean(ReadingRestController.class);
		restController.readBook();
	}

}
