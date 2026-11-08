package text.section_28;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hello {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing サンプルアプリ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		
		JButton button = new JButton("こんにちは!クリックしてください");
		button.setBounds(50, 50, 200, 30);
		frame.add(button);
		
		button.addActionListener(e -> {
			JOptionPane.showMessageDialog(frame, "Hello World");
		});
		
		frame.setVisible(true);

	}

}
