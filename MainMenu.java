import java.awt.*;
import javax.swing.*;

public class MainMenu extends JPanel {
	
	public MainMenu() {
		super(new FlowLayout());
		JPanel panel1 = new JPanel(new GridLayout(2,1));
		JPanel panel2 = new JPanel(new GridLayout(2,1));
		JPanel panel3 = new JPanel(new GridLayout(2,1));
		JPanel panel4 = new JPanel(new GridLayout(2,1));
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		JLabel label1 = new JLabel("Player 1 name: ");
		JLabel label2 = new JLabel("Player 2 name: ");
		JLabel label3 = new JLabel("Best of: ");
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		panel1.add(label1);
		panel1.add(text1);
		panel2.add(label2);
		panel2.add(text2);
		panel3.add(label3);
		panel3.add(text3);
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("CANCEL");
		panel4.add(ok);
		panel4.add(cancel);
	}
}