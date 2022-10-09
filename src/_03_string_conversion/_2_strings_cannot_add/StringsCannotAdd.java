package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {
public static void main(String[] args) {
	

		// 1) Make a main method that includes all the steps below…. 
		String fourAsString = JOptionPane.showInputDialog("Please enter the number 4.");
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
		String sixAsString = JOptionPane.showInputDialog("Please enter the number 6.");	
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			JOptionPane.showMessageDialog(null, fourAsString + sixAsString);
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
		String fiveAsString = JOptionPane.showInputDialog("Please enter the number 5.");	
			// Did you notice 46 instead of 4 + 6 = 10?
			JOptionPane.showMessageDialog(null, fourAsString + sixAsString + fiveAsString);
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			int fourAsInt = Integer.parseInt(fourAsString);
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			int sixAsInt = Integer.parseInt(sixAsString);
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			JOptionPane.showMessageDialog(null, "Incorrect, converting to ints");
			JOptionPane.showMessageDialog(null, fourAsInt + sixAsInt);
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			int fiveAsInt = Integer.parseInt(fiveAsString);
			// 7) Do the same for sixAsString. 
			JOptionPane.showMessageDialog(null, fourAsInt + sixAsInt + fiveAsInt);
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
}
}