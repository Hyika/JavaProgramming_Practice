import java.util.Scanner;
public class Lec2Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 개의 정수 입력: ");
		
		int num_1 = input.nextInt();
		int num_2 = input.nextInt();
		
		if(num_1 > num_2) {
			System.out.println("큰 수: " + num_1);
		}
		else if(num_1 < num_2) {
			System.out.println("큰 수: " + num_2);
		}
		else
			System.out.println("둘이 같음");
	}
}
