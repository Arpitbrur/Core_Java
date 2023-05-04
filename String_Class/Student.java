package String_Class;

public class Student {

	int rollno;
	String name;
	
	Student(int rollno, String name){
		
		this.rollno=rollno;
		this.name=name;
		
	}
	public String toString() {
		
		return rollno+" "+name;
	}
	public static void main(String[] args) {
		Student s= new Student(102, "Arpit");
		System.out.println(s);
		System.out.println(s.toString());
	}
}
