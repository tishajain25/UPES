/* Code to write a program in Java to read a statement from console, convert it into 
upper case and again print on console.   */

import java.util.*;

public class Exp8_3 {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = x.nextLine();
		System.out.println(s.toUpperCase());
	}
}
