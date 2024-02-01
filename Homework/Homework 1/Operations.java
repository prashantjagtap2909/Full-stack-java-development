package Arithmetic;

public class Operations {
	
	void add(int a , int b) {
		int c = a+b;
		System.out.println("Addition is: " + c);
	}
	
	void sub(int a , int b) {
		int c = a-b;
		System.out.println("Subtraction is: " + c);
	}
	
	void mul(int a , int b) {
		int c = a*b;
		System.out.println("Multiplication is: " + c);
	}
	
	void div(int a , int b) {
		int c = a/b;
		System.out.println("Division is: " + c);
	}
	
	void mod(int a , int b) {
		int c = a%b;
		System.out.println("mod is: " + c);
	}
	
	void avg(int a , int b) {
		int c = (a+b)/2;
		System.out.println("Average is: " + c);
	}
	
	void area(int a , int b) {
		int c = a*b;
		System.out.println("Area is: " + c);
	}
	
	void cube(int a) {
		int c = a*a*a;
		System.out.println("Cube is: " + c);
	}
	
	void perimeter(int a , int b) {
		int c = 2*(a+b);
		System.out.println("Perimeter is: " + c);
	}
	
	void square(int a) {
		int c = a*a;
		System.out.println("Square is: " + c);
	}
	
	public static void main(String[] args) {
		Operations o = new Operations();
		o.add(3 , 4);
		o.sub(4 , 3);
		o.mul(3 , 4);
		o.div(3 , 4);
		o.mod(3 , 4);
		o.avg(3 , 4);
		o.area(3 , 4);
		o.cube(2);
		o.perimeter(3 , 4);
		o.square(3);
	}
	
	
}
