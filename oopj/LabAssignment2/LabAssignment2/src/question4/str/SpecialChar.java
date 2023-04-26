/*Example Input: "He#llo $Wo%rld1!"
Example Output: "HelloWorld1"*/

package question4.str;

import java.util.Scanner;

public class SpecialChar {
	private static Scanner sc =new Scanner(System.in);
	
	static void converter(String str) {
		String newStr= str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newStr);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string.: ");
		String str = sc.nextLine();
		SpecialChar.converter(str);
	}

}
