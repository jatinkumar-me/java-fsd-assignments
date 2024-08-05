import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) throws InputMismatchException {
		/*
		 * // Write a java program to print the grade of a student. // Condition: Grade
		 * is > 90 A+ // < 50 fail // < 60 D // < 70 C // < 80 B
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your grade");

		int marks = sc.nextInt();
		sc.close();

		String grade = "";

		if (marks > 100 || marks < 0) {
			System.out.println("Invalid grades");
			return;
		}

		switch (marks/10) {
		case 10:
		case 9: grade = "A+"; break;
		case 8: grade = "A"; break;
		case 7: grade = "B"; break;
		case 6: grade = "C"; break;
		case 5: grade = "D"; break;
		default: grade = "fail";
		}

		System.out.println("Grade is: " + grade);
	}

}
