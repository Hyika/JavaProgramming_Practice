import java.util.Scanner;

public class QuadraticEq {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("b 값: ");
		float b = input.nextFloat();
		System.out.print("c 값: ");
		float c = input.nextFloat();
		
		double result1 = ( -b + Math.sqrt(b * b - 4 * c))/2;
		double result2 = ( -b - Math.sqrt(b * b - 4 * c))/2;
		boolean test = ( Math.sqrt(b * b - 4 * c) >= 0 );
		
		System.out.print("근이 나올 수 있는가?: ");
		System.out.println(test);
		System.out.println("Result is...r1: " + result1 + " r2: " + result2);
	}
}
