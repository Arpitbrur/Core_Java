package Method_overriding2;

public class BikeDriver {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		
		Bike bike2 = new TVS();
		bike2.run();
		
		Bike bike3 = new Hero();
		bike3.run();
	}
}
