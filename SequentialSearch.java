import java.util.Scanner;
public class SequentialSearch {

	public static void main(String[] args) {
		int s[] = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = input.nextInt();
		
		for(int i = 0; i < s.length; i++) {
			if(num > s[i] && i == s.length - 1) {
				 // ���� ū �� ���� num���� Ŭ ��
				System.out.println(num + "��(��)" + s[s.length - 1] + "���� Ů�ϴ�.");
			}
			else if(num < s[0] && i == s.length - 1) {
				// ���� ���� �� ���� num���� ���� ��
				System.out.println(num + "��(��)" + s[0] + "���� �۽��ϴ�.");
			}
			else if(num > s[i] && num < s[i+1]) {
				// ���� ���� ���� ���������� ���� ���� ��
				System.out.println(num + "��(��)" + s[i] + "���� ũ�� "+ s[i + 1] + "���� �۽��ϴ�.");
			}
			else if(num == s[i]) {
				// ���� ���� ���� �����ϸ鼭 ���� ��
				System.out.println(num + "��(��) ���� ���� �ְ�," + (i+1) + "��°�� �ֽ��ϴ�!");
			}
		}
		
		
	}

}
