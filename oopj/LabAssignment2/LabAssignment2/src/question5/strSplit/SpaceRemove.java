/*Example Input: "He#llo $Wo%rld1!"
Example Output: "HelloWorld1"*/

package question5.strSplit;

import java.util.Scanner;

public class SpaceRemove {
	private static Scanner sc =new Scanner(System.in);
	
	static void converter(String str) {
		String newStr= str.replaceAll(" ", "");
		System.out.println(newStr);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string.: ");
		String str = sc.nextLine();
		SpaceRemove.converter(str);
	}

}
