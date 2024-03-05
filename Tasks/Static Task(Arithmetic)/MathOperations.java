package operation;

public class MathOperations {

	public static int add(int a, int b) {
		int res = a+b;
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("Addition of two number is "+ add(20,30));
	}
}
