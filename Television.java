
public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	public Television(int channel, int volume, boolean onOff) {
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}
	
	void print() {
		System.out.println("�ڷ������� ä���� " + channel + "�̰�, ������ " + volume + "�Դϴ�.");
	}
	

}
