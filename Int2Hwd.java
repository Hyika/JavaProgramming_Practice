import java.util.Scanner;

public class Int2Hwd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Á¤¼ö ÀÔ·Â: ");
		int num = input.nextInt();
		
		switch(num) {
		case 0:{
			System.out.println("°ø");
			break;
		}
		case 1:{
			System.out.println("ÇÏ³ª");
			break;
		}
		case 2:{
			System.out.println("µÑ");
			break;
		}
		case 3:{
			System.out.println("»ï");
			break;
		}
		case 4:{
			System.out.println("³Ý");
			break;
		}
		case 5:{
			System.out.println("¿À");
			break;
		}
		case 6:{
			System.out.println("¿©¼¸");
			break;
		}
		case 7:{
			System.out.println("Ä¥");
			break;
		}
		case 8:{
			System.out.println("ÆÈ");
			break;
		}
		case 9:{
			System.out.println("¾ÆÈ©");
			break;
		}
		default:{
			System.out.println("³Ê¹« ¸¹¾Æ¿ä!");
			break;
		}
		}
	}
}
