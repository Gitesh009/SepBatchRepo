package package1;

public class chlidM extends ParentM{
	public void M() {
		System.out.println("Chlid Class default Method");
	}
	public void M1(int a) {
		super.Method2(7);
		this.M2(7, 9);
		this.M();
		this.M3(8, 8, 9);
		System.out.println("Chlid Class one parameterized Method");
	}
	public void M2(int a, int b) {
		System.out.println("Chlid Class two parameterized Method");
	}
	public void M3(int a, int b, int c) {
		System.out.println("Chlid Class three parametrized Method");
	}
	public static void main(String[] args) {
		chlidM chm = new chlidM();
		chm.M1(5);
		
	}
}
