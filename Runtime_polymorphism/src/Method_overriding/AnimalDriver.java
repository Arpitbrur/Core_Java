package Method_overriding;

public class AnimalDriver {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();
		
		Animal animal2 = new Dog();
		animal2.eat();
		
		Animal animal3 = new Lion();
		animal3.eat();
	}

}
