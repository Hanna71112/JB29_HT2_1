package by.htp.les04.main;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Введите X: ");
		int X = in.nextInt();
		System.out.print("Введите Y: ");
		int Y = in.nextInt();
		int a = 1;
		while (X > 0) {
			a = X % 10;
			X = X / 10;
			int b = Y;
			while (b > 0) {
				if (b % 10 == a) {
					System.out.print(a);
				}
				b = b / 10;
			}
		}
	}
}