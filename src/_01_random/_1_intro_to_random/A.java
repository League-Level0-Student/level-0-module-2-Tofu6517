package _01_random._1_intro_to_random;

import java.util.Random;

public class A {
	public static void main(String[] args) {
		int number = 0;
		Random ran = new Random();
		
		
		for (int i=0; i<1; i++) {
			// Uncomment the line of code below, and replace (_____)  with   (highest value - lowest value + 1)
			// For our example, this will be:  ( 75 - 25 + 1 )
			// Also replace <lowest value> with the start of the range.  For our example, this is 25.
			number=ran.nextInt(75-25+1)+ 25;
			// number = ran.nextInt(_____) + <lowest value>;
			System.out.println(number);
			
			for (i=0; i<1; i++) {
				number=ran.nextInt(88+222+1)+ -222;
				System.out.println(number);
					
				}
		}
	}

}
