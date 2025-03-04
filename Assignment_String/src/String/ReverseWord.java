package String;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence: ");
String sentence=sc.nextLine();
String reverse="";

	String[] name=sentence.split(" ");
	for(int j=name.length-1;j>=0;j--) {
		reverse+=name[j]+" ";
	}


System.out.print(reverse.trim());
	}

}
