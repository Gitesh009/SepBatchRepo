package package1;

import java.util.Scanner;

public class Scan1 {
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	public int sub(int a1, int b1){
		int c1 = a1-b1;
		return c1;

	}
	public int multi(int a2, int b2) {
		int c2 = a2*b2;
		return c2;
	}
	public void div(float a3, int b3) {
		float c3 = a3/b3;
		System.out.println("The ans is"+ c3);
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1 =ob.nextInt();
		System.out.println("Enter the value of x2");
		int x2 =ob.nextInt();
		System.out.println("Enter the value of x3");
		int x3 =ob.nextInt();
		System.out.println("Enter the value of x4");
		int x4 =ob.nextInt();
		System.out.println("Enter the value of x5");
		int x5 =ob.nextInt();
		System.out.println("Enter the value of x6");
		int x6 =ob.nextInt();
		
		Scan1 sc = new Scan1();
		int sumre1 = sc.sum(x1, x2);
		int sumre2 = sc.sum(sumre1, x3);
		int subre = sc.sub(sumre2, x4);
		float mutlire = sc.multi(subre, x5);
		sc.div(mutlire, x6);
	}
}
