package by.htp.les04.main;
//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.

//Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом. 

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите a: ");
		int a = in.nextInt();
		int A=a;
		int p = 0;
		int b=0;
		  int m = 0;
		  int n=0;
	    while (A>0)
	    	{ 
	        n = A%10;
	        A = A/10;
	        m = m*10 + n;
	    }
		System.out.println(m);
	    
		while (a!=0) {
			b = a%10;
			if (b%2 == 0) {
				p += b;
			}
				a /= 10;
				
			}
		System.out.println(p);
		}
	
}
