package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LottoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Random ran1 = new Random();
		Random ran2 = new Random();
		Random ran3 = new Random();
		Random ran4 = new Random();
		Random ran5 = new Random();
		int randomChoice = ran.nextInt (98 - 0 + 1) + 0;
		int randomChoice1 = ran1.nextInt (98 - 0 + 1) + 0;
		int randomChoice2 = ran2.nextInt (98 - 0 + 1) + 0;
		int randomChoice3 = ran3.nextInt (98 - 0 + 1) + 0;
		int randomChoice4 = ran4.nextInt (98 - 0 + 1) + 0;
		int randomChoice5 = ran5.nextInt (98 - 0 + 1) + 0;
		JOptionPane.showMessageDialog(null, "" + randomChoice +" "+ randomChoice1 +" "+ randomChoice2 +" "+ randomChoice3 +" "+ randomChoice4 +" "+ randomChoice5, "Lotto Tickit", 1);
		
	}

}
