package String;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the email: ");
		String email=sc.nextLine();
		
		
		int atIndex=email.indexOf('@');
		int lastAtIndex=email.indexOf('@');
		
		int dotIndex=email.lastIndexOf('.');
		
		
		
if(atIndex < 6|| dotIndex < atIndex + 5 || dotIndex >= email.length() - 1 || atIndex==lastAtIndex) {
	System.out.print("Wrong email Address");
}else{
	System.out.print("valid email Address "+email);
}
	
}
}
