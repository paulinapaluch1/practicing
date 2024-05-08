package org.examples.stack.modified;


class Main2 {
	public static void main(String[] args) {
		RecursiveAdditionProcessor processor = new RecursiveAdditionProcessor(0);
		processor.performRecursiveAddition();
	}
}

class RecursiveAdditionProcessor {
	private Integer currentSum;
	private int incrementer = 0;

	RecursiveAdditionProcessor(Integer initialSum) {
		this.currentSum = initialSum;
	}

	public void performRecursiveAddition() {
		try {
		int addedValue = this.incrementer++;
		System.out.println("before: total sum " + this.currentSum + " added value " + addedValue);
		printStackTrace();

		if (currentSum > 100) {
			return;
		}

		this.currentSum += addedValue;
		currentSum = Integer.valueOf(addedValue + this.currentSum);
		performRecursiveAddition();

		System.out.println("after: total sum " + this.currentSum + " added value " + addedValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void printStackTrace() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println("Current stack trace:");
		for (StackTraceElement element : stackTraceElements) {
			System.out.println("   at " + element);
		}
	}


}