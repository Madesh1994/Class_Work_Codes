package polymorphism;

public class MethodOverloading {

	// using int method with 2 variables
	public int Sum(int a, int b) {

		int c = a + b;
		System.out.println("\nA Value is " + a);
		System.out.println("B Value is " + b);

		System.out.println("Sum of 2 values is " + c);

		return c;
	}

	// using int method with 3 variables
	public int Sum(int a, int b, int c) {

		c = a + b;
		System.out.println("\nA Value is " + a);
		System.out.println("B Value is " + b);

		System.out.println("Sum of 2 values is " + c);

		return c;
	}

	// using double method

	public double Sum(double a, double b) {

		double c = a + b;
		System.out.println("\nA Value is " + a);
		System.out.println("B Value is " + b);

		System.out.println("Sum of 2 values is " + c);

		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*************Method OverLoading*************");
		MethodOverloading method1 = new MethodOverloading();
		method1.Sum(20, 30);
		method1.Sum(12, 40, 01);
		method1.Sum(20.22, 13.02);

	}

}
