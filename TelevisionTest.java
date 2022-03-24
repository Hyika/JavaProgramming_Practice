
public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		int ch_myTv = myTv.getChannel();

		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		int ch_yourTv = yourTv.getChannel();
		
		myTv.print();
		yourTv.print();
		System.out.println("현재 채널은 " + ch_myTv + "입니다.");
		System.out.println("현재 채널은 " + ch_yourTv + "입니다.");
		
		myTv.setChannel(11);
		System.out.println("현재 채널은 " + ch_myTv + "입니다.");
		yourTv.setChannel(13);
		System.out.println("현재 채널은 " + ch_yourTv + "입니다.");
	}

}
