import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JPanel{
	
	JPanel[] panels = new JPanel[4];
	JTextField[] textField = new JTextField[3];	
	JButton ok;
	JButton cancel;	
	
	public MainMenu() {
		super(new FlowLayout());

		for(int i=0;i<4;i++){
			panels[i] = new JPanel(new GridLayout(1,2));
			panels[i].setPreferredSize(new Dimension(300, 50));
			this.add(panels[i]);
		}	
			
		JLabel label1 = new JLabel("Player 1 name: ");
		JLabel label2 = new JLabel("Player 2 name: ");
		JLabel label3 = new JLabel("Best of: ");

		panels[0].add(label1);
		panels[1].add(label2);
		panels[2].add(label3);
	
		for(int i = 0;i<3;i++){
			textField[i] = new JTextField();
			panels[i].add(textField[i]);
		}		
	
		ok = new JButton("OK");
		cancel = new JButton("CANCEL");
		panels[3].add(ok);
		panels[3].add(cancel);
		/**
		ok.addActionListener(new ActionListener(){   
			public void actionPerformed(ActionEvent e){
				CardLayout card = (CardLayout) parent.getLayout();
				card.show(parent, "Game");
			}
		});
		**/
		cancel.addActionListener(new ActionListener(){   
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
	}

	public JButton getOKButton(){
		return ok;
	}
}
