package abstraction;

public class AbstractionMailClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionClass objVBike = new Bike();
		AbstractionClass objVCar = new Car();

		System.out.println("**********Abstraction Class************");
		System.out.println("Bike engine " + objVBike.engine());
		System.out.println("Bike tier " + objVBike.tier());
		System.out.println("Car engine " + objVCar.engine());
		System.out.println("Car tier " + objVCar.tier());

		objVBike.break1();
	}

}
