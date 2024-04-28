package org.examples.inversionofcontrol;

public class ReadingRestController {
	private ReadingService readingService;

	public ReadingRestController(ReadingService readingService) { //dependency injection
		this.readingService = readingService;
	}

	public ReadingRestController(Object[] properties) {
		this.readingService = new ReadingService(properties);
	}

	void readBook(){
		readingService.read();
	}
}
