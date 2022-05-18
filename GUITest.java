import java.awt.*;
import javax.swing.*;

public class GUITest extends JFrame{
	GUITest(){
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		panel1.add(button1);
		panel1.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel3.add(panel1);
		panel3.add(panel2);
		add(panel3);
		setTitle("Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String args[]) {
		GUITest test = new GUITest();
	}
}
