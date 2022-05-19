package test;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(readString());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է����ÿ�.");
		System.in.read(buf);
		return new String(buf);
	}

}