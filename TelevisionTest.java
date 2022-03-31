
public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television(7, 10, true);

		Television yourTv = new Television(9, 12, true);
		
		myTv.print();
		yourTv.print();
		System.out.println("현재 채널은 " + myTv.channel + "입니다.");
		System.out.println("현재 채널은 " + yourTv.channel + "입니다.");
	}

}
