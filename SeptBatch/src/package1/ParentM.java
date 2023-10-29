package package1;

public class ParentM {
	public void Method1() {
		System.out.println("Parent Class default Method");
	}
	public void Method2(int a) {
		this.Method3(8, 9, 7);
		this.Method1();
		this.Method2(7, 5);
		System.out.println("Parent Class one parameterized Method");
	}
	public void Method2(int a, int b) {
		System.out.println("Parent Class two parameterized Method");
	}
	public void Method3(int a, int b, int c) {
		System.out.println("Parent Class three parameterized Method");
	}

}
