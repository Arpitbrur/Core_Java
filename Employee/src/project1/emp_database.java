package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class emp_database {

	private String name;
	private int id;
	private int salary;
	private int deptno;
	private String job;
	
	public emp_database(String name, int id, int salary, int deptno, String job) {
	
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.deptno = deptno;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}


	public int getDeptno() {
		return deptno;
	}

	public String getJob() {
		return job;
	}
	
	public String toString() {
		return name+" "+id+" "+salary+" "+deptno+" "+job;
	}
	
}


  class employeed{
	  public static void main(String[] args) {
		List l = new ArrayList();
		Scanner S = new Scanner(System.in);
		Scanner S1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("=========Welcome To QSpider=========");
			System.out.println("1. Insert the Employee");
			System.out.println("2. Display the Record");
			System.out.println("3. Search the Employee");
			System.out.println("4. Remove Employee");
			System.out.println("5. Update Employee");
			System.out.println("Enter your choice");
			ch= S.nextInt();	
		
		
			switch(ch) {
			case 1:
				//insert
				System.out.println("Enter Name");
				String name= S1.nextLine();
				System.out.println("Enter id");
				int id = S.nextInt();
				System.out.println("Enter the Salary");
				int salary = S.nextInt();
				System.out.println("Enter the Deptno");
				int deptno = S.nextInt();
				System.out.println("Enter the job");
				String job= S1.nextLine();	
				
				l.add(new emp_database(name, id, salary, deptno, job));
				//System.out.println(--------------------------------------------------);
				System.out.println("Data is Inserted");
				break;	
			}
			
		}
	}
  }
  
