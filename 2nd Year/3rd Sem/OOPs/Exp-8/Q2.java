/* Code to write a program that converts all characters of a string in capital letters. 
(Use StringBuffer to store a string). Don’t use inbuilt function.  */

import java.util.*;

public class StringExp2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str = Sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String a = "";
        for (int i = 0; i < sb.length(); i++) {
            char s = (char) ((int) sb.charAt(i) - 32);
            a = a + s;
        }
        System.out.println(a);
    }
}
