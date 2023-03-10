/* Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form. 
Between 40 and 50 : PASS 
Between 51 and 75 : MERIT 
and above : DISTINCTION  */

import java.util.*;

public class Marks {
	static void sort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int marks[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the marks of each Student" + (i + 1) + "=");
			marks[i] = Sc.nextInt();
		}
		sort(marks);
		System.out.println("--------------GRADE CARD--------------");
		System.out.println("Name\t\tMarks\t\tGrades");
		for (int i = 0; i < 10; i++) {
			if (marks[i] < 40) {
				System.out.println("Student" + (i + 1) + "\t" + marks[i] + "\t\tFAIL");
			} else if (40 <= marks[i] && marks[i] < 50) {
				System.out.println("Student" + (i + 1) + "\t" + marks[i] + "\t\tPASS");
			} else if (51 <= marks[i] && marks[i] < 75) {
				System.out.println("Student" + (i + 1) + "\t" + marks[i] + "\t\tMERIT");
			} else if (marks[i] > 75) {
				System.out.println("Student" + (i + 1) + "\t" + marks[i] + "\t\tDISTINCTION");
			} else {
				System.out.println("Enter marks between 0 and 100.");
			}
		}
	}
}
