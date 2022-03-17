import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.print("Please Input Number...: ");
		
		// 정수 입력
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		// if~else문
		if(num % 2 == 0) {
			System.out.println("Even Number!");
		}
		else {
			System.out.println("Odd Number!");
		}
	}
}
