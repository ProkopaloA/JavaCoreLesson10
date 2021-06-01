package ua.lviv.lgs;

import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a palindrome of 5 letters: ");
		String word = sc.next();
		String result = "";
		if (word.length() == 5) {

			for (int i = 0; i < word.length(); i++) {
				result = word.charAt(i) + result;
			}
			if (result.equalsIgnoreCase(word)) {
				System.out.println("Yes, this is a palindrome!");
			} else {
				System.out.println("No, this is not a palindrome!");
			}

		} else {
			System.out.println("The word does not contain 5 letters! ");
		}
		System.out.println(result.toLowerCase());
		System.out.println();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = sc1.nextLine();
		System.out.println(str.replaceAll("[aeiouàåè³îóÿþº¿]", "-"));
		
	}

}
