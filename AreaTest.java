import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("반지름 값 입력...: ");
		final double PI = 3.141592;
		double radius = input.nextDouble();
		double area = radius * radius * PI;
		
		System.out.println("반지름이 " + radius + "인 원의 면적은 " + area + "입니다.");
	}
}
