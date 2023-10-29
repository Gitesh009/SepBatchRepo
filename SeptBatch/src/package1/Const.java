package package1;

public class Const {
	public Const() {
		this(7,8,5);
		System.out.println("Default constructor");
		// TODO Auto-generated constructor stub
	}
	public Const(int a) {
		this();
		System.out.println("One Parametrize constructor");
		// TODO Auto-generated constructor stub
	}
	public Const(int a, int b) {
		this(7,8,9,4);
		System.out.println("Two Parametrize constructor");
		// TODO Auto-generated constructor stub
	}
	public Const(int a, int b, int c) {
		
		System.out.println("Three Parametrize constructor");
		// TODO Auto-generated constructor stub
	}
	public Const(int a, int b, int c, int d) {
		this(78);
		System.out.println("Four Parametrize constructor");
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Const co = new Const(12,4);
}

}
