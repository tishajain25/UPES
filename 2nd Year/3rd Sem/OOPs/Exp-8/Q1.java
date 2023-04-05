/* Code to write a program for searching strings for the first occurrence of a character 
or substring and for the last occurrence of a character or substring.  */

import java.util.*;

public class StringExp1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = Sc.nextLine();
        int count = 0;
        int first = 0;
        int last = 0;
        System.out.print("Enter a character or substring to be searched:");
        String c = Sc.next();
        int d = c.length();
        int l = c.length() - 1;
        for (int i = 0; i < str.length() - l; i++) {
            String m = str.substring(i, d + i);
            if (c.equals(m)) {
                count++;
                if (count == 1) {
                    first = i;
			  last = i;
                } else {
                    last = i;
                }
            }
        }
        System.out.println("First Occurance:" + (first));
        System.out.println("Last Occurance:" + (last));
    }
}
