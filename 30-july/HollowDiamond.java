import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[] args) {
		System.out.println("Enter height of star");

		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		sc.close();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i + 1 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = height - 2; i >= 0; i--) {
			for (int j = 0; j < height - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i + 1 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
