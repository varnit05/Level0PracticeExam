import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise1 {
public static void main(String[] args) {
String age= JOptionPane.showInputDialog("how old are you?");
	int x = Integer.parseInt(age);
	if(x > 30){
	JOptionPane.showMessageDialog(null, "You're too old for this game!");
	}
	
	
	int y = 2017 - x;
	
	JOptionPane.showMessageDialog(null, "You were born in" + y);
	
}
}
