
public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television(7, 10, true);

		Television yourTv = new Television(9, 12, true);
		
		myTv.print();
		yourTv.print();
		System.out.println("���� ä���� " + myTv.channel + "�Դϴ�.");
		System.out.println("���� ä���� " + yourTv.channel + "�Դϴ�.");
	}

}
