package org.examples.stack.basic;


 class Main {
	public static void main(String[] args){
		ClassWithRecursiveMethod test = new ClassWithRecursiveMethod(0);
		test.addRandomToInteger();

	}
}


 class ClassWithRecursiveMethod {

	private Integer integer;
	private int x = 0;

	public ClassWithRecursiveMethod(Integer integer) {
		this.integer = integer;
	}

	public void addRandomToInteger(){
		int localInteger = this.x++;
		System.out.println("before: sum " + this.integer + " local number " + localInteger);

		if(integer > 100){
			return;
		}
		this.integer = this.integer + localInteger;
		integer = Integer.valueOf(localInteger + this.integer);
		addRandomToInteger();

		System.out.println("after: sum " + this.integer + " local number " + localInteger);

	}

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
