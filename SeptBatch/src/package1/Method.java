package package1;

public class Method {
	public void M()
	{
		this.M3();
		System.out.println("Default Method");
		this.M1();
		this.M4();
		this.M2();
	}
	public void M1()
	{
		System.out.println("One Method");
	}
	public void M2()
	{
		System.out.println("Two Method");
	}
	public void M3()
	{
		System.out.println("Three Method");
	}
	public void M4()
	{
		System.out.println("Four Method");
	}
public static void main(String[] args) {
	Method me = new Method();
	me.M();
}

}
