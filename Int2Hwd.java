import java.util.Scanner;

public class Int2Hwd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = input.nextInt();
		
		switch(num) {
		case 0:{
			System.out.println("��");
			break;
		}
		case 1:{
			System.out.println("�ϳ�");
			break;
		}
		case 2:{
			System.out.println("��");
			break;
		}
		case 3:{
			System.out.println("��");
			break;
		}
		case 4:{
			System.out.println("��");
			break;
		}
		case 5:{
			System.out.println("��");
			break;
		}
		case 6:{
			System.out.println("����");
			break;
		}
		case 7:{
			System.out.println("ĥ");
			break;
		}
		case 8:{
			System.out.println("��");
			break;
		}
		case 9:{
			System.out.println("��ȩ");
			break;
		}
		default:{
			System.out.println("�ʹ� ���ƿ�!");
			break;
		}
		}
	}
}
