package package1;

public class chlid extends Parent {
	public chlid()
	{ 	this (4,6,8);
		System.out.println("Child default constructor");
	}
	public chlid(int a)
	{	this();
		System.out.println("Child one parameterized constructor");
	}
	public chlid(int a,int b)
	{	super (25,30);
		System.out.println("Child two parameterized constructor");
	}
	public chlid(int a, int b, int c)
	{   this(8,2);
		System.out.println("Child three parameterized constructor");
	}
	public static void main(String[] args) {
		chlid ch = new chlid(20);
	}
	
}
