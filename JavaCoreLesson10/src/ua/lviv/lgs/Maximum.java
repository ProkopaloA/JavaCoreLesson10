package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words on one line separated by a space: ");
		String text = sc.nextLine();
		int count = 0;
		if (text.length() != 0) {
			count++;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ' ') {
					count++;
				}
			}
		}
		System.out.println("You entered " + count + " words ");
		System.out.println();
		text = text.toLowerCase();
		String textArray[] = text.split("[. !?]");

		int indexArray[] = { -1, 0 };
		for (int i = 0; i < textArray.length; i++) {
			if (!textArray[indexArray[1]].equals(textArray[i]) || indexArray[0] < 0) {
				int count2 = 1;
				for (int p = i + 1; p < textArray.length; p++) {
					if (textArray[i].equals(textArray[p])) {
						count2++;
					}
				}
				if (indexArray[0] < count2) {
					indexArray[0] = count2;
					indexArray[1] = i;
				}
			}

		}

		System.out.println("Most repeated word: " + textArray[indexArray[1]] + " (occurs " + indexArray[0] + " times)");

	}

}
