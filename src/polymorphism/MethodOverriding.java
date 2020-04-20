package polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n************Method Overriding************");
		ParentOverrideClass child1 = new OverrideClassA();
		ParentOverrideClass child2 = new OverrideClassB();

		// child1
		child1.sum();
		child2.sum();

	}

}
