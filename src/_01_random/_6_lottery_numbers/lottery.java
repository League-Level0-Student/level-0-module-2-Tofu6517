package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		Random ran = new Random();
		int number = 0;

		String numberString ="";

		for (int i=0; i<6; i++) {

			number=ran.nextInt(100);
			numberString += number + " ";
		}

		JOptionPane.showMessageDialog(null, numberString);		


	}
}
