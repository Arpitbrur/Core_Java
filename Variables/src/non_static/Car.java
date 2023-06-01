package non_static;

public class Car {

	int carModal =2022;
	String carColor ="black";
	String carName = "MAruti";
	double carPrice = 3000000.0;
	int noOfWheel =4;
	
	public void carDetail() {
		System.out.println("Driving, Sleeping, Eating");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Modal of car is:- "+c.carModal);
		System.out.println("Color of car is:- "+c.carColor);
		System.out.println("Name of car is:- "+c.carName);
		System.out.println("Price of car is:- "+c.carPrice);
		System.out.println("Wheel of car id:- "+c.noOfWheel);
		c.carDetail();
	}
}


