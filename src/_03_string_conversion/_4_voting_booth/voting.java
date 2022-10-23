package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int vote = Integer.parseInt(age);
		if(vote >= 18) {
			JOptionPane.showInputDialog("Who do you think should be the next president?");
			JOptionPane.showMessageDialog(null, "Thank you for your response.");
		}else {
			JOptionPane.showMessageDialog(null, "You are currently not old enough to vote.");
		}
	}
}
