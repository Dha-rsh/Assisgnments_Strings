package String;

import java.util.Scanner;

public class ReverseCharacter {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("The Original String is: ");
	String name=sc.nextLine();
    String rev="";
	for(int i=name.length()-1;i>=0;i--) {
		rev+=name.charAt(i);
	}
	System.out.print("The reversed string is: "+rev);
}
	
}
