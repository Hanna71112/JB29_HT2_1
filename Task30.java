package by.htp.les04.main;

//Написать программу, переводящую римские цифры в арабские
import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Введите римскую цифру: ");
		String letter = in.next();
		
		switch (letter) {
		case "I":
			System.out.println("1");
			break;

		case "II":
			System.out.println("2");
			break;
			
		case "III":
			System.out.println("3");
			break;
			
		case "IV":
			System.out.println("4");
			break;

		case "V":
			System.out.println("5");
			break;

		case "VI":
			System.out.println("6");
			break;
			
		case "VII":
			System.out.println("7");
			break;
			
		case "VIII":
			System.out.println("8");
			break;
			
		case "IX":
			System.out.println("9");
			break;
			
		case "X":
			System.out.println("10");
			break;
		}

	//	System.out.println(letter);

	}
}