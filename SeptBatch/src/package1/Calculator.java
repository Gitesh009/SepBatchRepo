package package1;

public class Calculator {
	public int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public int sub (int a1, int b1) {
		int c1 = a1 - b1;
		return c1;
	}
	
	public int multi (int a2, int b2) {
		int c2 = a2*b2;
		return c2;
	}
	
	public void divide (int a3, int b3) {
		int c3 = a3/b3;
		System.out.println("The Final Result is " + c3);
	}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	int re1 = cal.sum(10, 2);
	int re2 = cal.sum(re1, 2);
	int re3 = cal.sub(re2, 2);
	int re4 = cal.multi(re3,2);
	cal.divide(re4, 2);
			
}
}
