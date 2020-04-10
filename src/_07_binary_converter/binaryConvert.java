package _07_binary_converter;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.event.ActionEvent;

public class binaryConvert implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel=new JPanel();
	JTextField text = new JTextField(20);
	JLabel label = new JLabel();
	JButton button = new JButton();
	public void start() {
	
	label.setText( "binary Converter");
	frame.add(label);
	panel.add(button);
	panel.add(text);
	frame.add(panel);
	frame.pack();
	frame.setSize(500,500);
	frame.setVisible(true);
	button.addActionListener(this);
	
	
	
}

String convert(String text) {
    if(text.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!text.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(text, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}

@Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
	 String textConvert = text.getText();
	System.out.println(convert(textConvert));
	
}
}
