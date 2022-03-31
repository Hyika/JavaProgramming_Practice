import java.util.Scanner;
public class Lec3Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하시오: ");
		int num = input.nextInt();

		System.out.println( num + "의 약수는 다음과 같습니다.");

		int i = num;
		while(i > 0 ) {
			int n = 0;
			if(num % i == 0) {
				n = num / i;
				System.out.print(n + " ");
			}
			i--;
		}
	}
}
