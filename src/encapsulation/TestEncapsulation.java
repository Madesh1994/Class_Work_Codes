package encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting values
		Encapsulation1 objEncap = new Encapsulation1();
		objEncap.setName("Madesh");
		objEncap.setAge(25);
		
		//printing values
		System.out.println("User Name is " + objEncap.getName());
		System.out.println("User Age is " + objEncap.getAge());

	}

}
