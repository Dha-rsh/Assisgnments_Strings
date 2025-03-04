package String;

import java.util.Scanner;

public class CountVowels {
public static void main(String atgs[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String: ");
	String name=sc.nextLine();
	System.out.print("count of vowels in the string: "+vowelsCount(name));
	
}
public static int vowelsCount(String name){
	int count=0;
	name= name.toLowerCase();
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
			count++;
		}
	}
	return count;
}
}
