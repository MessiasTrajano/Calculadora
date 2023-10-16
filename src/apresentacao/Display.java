package apresentacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Display extends JPanel{

	private JLabel label;
		
	public Display() {
		
				label = new JLabel();
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font("arial", Font.BOLD, 40));
		this.setBackground(Color.GRAY);
		add(label);
	}
	
	public void setLabel(String texto) {
		label.setText(label.getText() + texto);
	}
	public void limpar(){

		label.setText("");
	}
	
}
