package org.examples.inversionofcontrol;

public class ReadingRestController {
	private ReadingService readingService;

	//after
	public ReadingRestController(ReadingService readingService) { //dependency injection
		this.readingService = readingService;
	}

	//before
	public ReadingRestController(Object[] properties) {
		this.readingService = new ReadingService(properties);
	}

	void readBook(){
		readingService.read();
	}
}
