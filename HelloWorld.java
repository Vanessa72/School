import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld implements ActionListener {

	JLabel label;
	JButton plusButton, minusButton;
	int clickCount = 0;
	
	public static void main(String[] args) {
		HelloWorld w = new HelloWorld();
		w.showFrame();
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == plusButton)
		{
			this.clickCount += 1;
		}
		else if(event.getSource() == minusButton)
		{
			this.clickCount -= 1;
		}
			
			
		label.setText(clickCount + " times clicked");
		label.setSize(label.getPreferredSize());
	}
	
	private void showFrame() {
		JFrame frame = new JFrame ("HelloWorld");
		frame.setBounds(100, 100, 400, 400);
		
		
		JButton plusButton = new JButton("plus");
		plusButton.setBounds(50, 50, 100, 30);
		plusButton.addActionListener(this);
		frame.add(plusButton);
		this.plusButton = plusButton;
		
		JButton minusButton = new JButton("minus");
		minusButton.setBounds(180, 50, 100, 30);
		minusButton.addActionListener(this);
		frame.add(minusButton);
		this.minusButton = minusButton;
		
		JLabel label = new JLabel("0 times clicked");
		label.setBounds(50, 100, 0, 0);
		label.setSize(label.getPreferredSize());
		label.setBackground(Color.white);
		label.setOpaque(true);
		frame.add(label);
		this.label =label;
		
		frame.setLayout(null);
		frame.setVisible(true);
		
	}



	
	
}
