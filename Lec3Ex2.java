import java.util.Scanner;
public class Lec3Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int num = input.nextInt();

		System.out.println( num + "�� ����� ������ �����ϴ�.");

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
