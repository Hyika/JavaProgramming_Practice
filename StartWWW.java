import java.util.Scanner;

public class StartWWW {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���(����� quit): ");
			String str  = input.next();
			if(str.equals("quit") == true) {
				System.out.println("�����մϴ�.");
				break;
			}
			if(str.matches("^www\\.(.+)") == true) {
				System.out.println(str + " �� 'www.'�� �����մϴ�.");
			}
			else {
				System.out.println(str + " �� 'www.'�� �������� �ʽ��ϴ�.");
			}
		}
	}
}
