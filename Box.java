
public class Box {
	int width;
	int length;
	int height;
	Box(int width, int length, int height){
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	boolean isSameBox(Box obj){
		int size1 = width + length + height;
		int size2 = obj.width * obj.length + obj.height;
		if(size1 == size2) {
			return true;
		}
		else
			return false;
	}
}
