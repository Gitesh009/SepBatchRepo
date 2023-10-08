package package1;

public class Student {
	int rollno;
	int age;
	
	public void display1(){
		System.out.println("Welcome to automation class");
	}
	
	public void display2() {
		System.out.println("Autoamtion is easy");
	}
public static void main(String[] args) {
	Student G = new Student();
	G.display1();
	G.display2();
	G.age=27;
	{
		System.out.println("age of G is " + G.age);
}
G.rollno = 290;
{
	System.out.println("Roll number of G is " + G.rollno);
}
}

}
