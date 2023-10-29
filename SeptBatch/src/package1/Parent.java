package package1;

public class Parent {
	public Parent() {
		this (8);
		System.out.println("Parent default constructor");
	}
	
	public Parent(int a) {
		this (7,9,5);
		System.out.println("Parent one parameterized constructor");
	}
	
	public Parent(int a, int b) {
		this ();
		System.out.println("Parent two parameterized constructor");
	}
	public Parent(int a, int b, int c)
	{
		System.out.println("Parent three parameterized constructor");
	}
}