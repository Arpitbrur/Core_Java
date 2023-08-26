package Encapsulation;

public class FruitDriver {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		fruit.setFruitId(102);
		fruit.setFruitname("Apple");
		fruit.setFruitColor("red");
		
		System.out.println(fruit.getFruitId());
		System.out.println(fruit.getFruitname());
		System.out.println(fruit.getFruitColor());
	}
}
