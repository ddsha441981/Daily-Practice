package practice_set_1;

import java.util.Scanner;

interface Clients{
	void input();
	void output();
}

interface DefInterface{
	void a1();
	void b1();
	default void a3(){
		System.out.println("This is Default method");
	}

interface StaticInterface{

	// We can main method inside intreface in 1.8
	public static void main(String[] args) {
		
	}

	// we can use static method inside interfce and do not call with object and we can not override method
	static void staticMethod(){
		System.out.println("This is static method");
	}
}

}


class Developer implements Clients{
	String empName;
	Double salary;

	@Override
	public void input(){
		Scanner r = new Scanner(System.in);
		System.out.println("Please enter employee name===>");
		empName = r.nextLine();
		System.out.println("Please enter employee Salary===>");
		salary = r.nextDouble();
	}

	@Override
	public void output(){
		System.out.println("output is " + empName + "Salary" + salary);
	}

}

public class Handling{
	public static void main(String[] args) {
		
		Developer dev = new Developer();
		dev.input();
		dev.output();
	}
}