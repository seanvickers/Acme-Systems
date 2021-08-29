package ver1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello from Eclipse");
		System.out.println("Hello from GitHub!");
	}

public static void heyNow() {
	String Msg = "Hey Now!";
	System.out.println(Msg);
}
	
public static void whatFor(){
	String msg = "";
	System.out.print("Enter ");
	Scanner input = new Scanner(System.in);
	msg = input.nextLine();
	msg += ", what for?";
	System.out.println(msg);
}
