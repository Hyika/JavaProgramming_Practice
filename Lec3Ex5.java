import java.util.Scanner;
public class Lec3Ex5 {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("PI 계산... 반복횟수 입력: ");
		double PI = 0;
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 1)
				PI += 4.0/(2.0 * i - 1.0);
			else
				PI += 4.0/(2.0 * i - 1.0) * (-1.0);
		}
		System.out.println("\nPI: " + PI);
	}
}
