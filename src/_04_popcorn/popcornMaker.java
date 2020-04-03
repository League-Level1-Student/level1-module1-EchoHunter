package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornMaker {


	public static void main(String[] args) {
	String flavour = JOptionPane.showInputDialog("What flavour of popcorn would you like?");
	String time = JOptionPane.showInputDialog("What amount of minutes would you like your popcorn to be cooked for?");
int cookTime = Integer.parseInt(time);
Popcorn p = new Popcorn(flavour);
 Microwave m = new Microwave();

m.putInMicrowave(p);
m.setTime(cookTime);
m.startMicrowave();
	
	
	
	
	
	
	
	
	
	
	
	}
}
