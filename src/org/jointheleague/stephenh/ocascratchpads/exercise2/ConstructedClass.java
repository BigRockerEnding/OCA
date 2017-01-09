package org.jointheleague.stephenh.ocascratchpads.exercise2;

public class ConstructedClass {
	public static void main(String[] args) {
		System.out.println("In main method");
		ConstructedClass construct = new ConstructedClass();
		System.out.println(construct.veggie + " is different from " + ConstructedClass.roundedPI);
	}
	
	public String veggie = "potato";
	
	{
		System.out.println("In intializer block");
		System.out.println("Super " + veggie);
		System.out.println(Integer.MAX_VALUE + " and " + (int)(Math.pow(2, 31) - 1));
		System.out.println(Integer.MIN_VALUE + " and " + (int)Math.pow(-2, 31));
	}
	
	{
		System.out.println("In another intializer block");
		System.out.println("Super " + veggie + " DX");
	}
	
	public static String roundedPI = "3.14";
	
	static {
		System.out.println("In static initializer block");
		System.out.println("Delicious " + roundedPI);
	}
	
	static {
		System.out.println("In another static initializer block");
		System.out.println("Still delicious " + roundedPI);
	}
	
	public ConstructedClass() {
		System.out.println("In constructor");
		veggie = "cucumber";
	}
}
