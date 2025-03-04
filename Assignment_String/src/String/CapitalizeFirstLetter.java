package String;

import java.util.Scanner;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence: ");
String sentence=sc.nextLine();


String[] word=sentence.split(" ");
String str="";

for(int i=0;i<word.length;i++) {
	if(!word[i].isEmpty()) {
	str+=Character.toUpperCase(word[i].charAt(0))+word[i].substring(1)+" ";
	}
	
}
System.out.print(str);
	}

}
