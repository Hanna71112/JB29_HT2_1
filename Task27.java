package by.htp.les04.main;
// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры. 

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите m: ");
		int m = in.nextInt();
		System.out.print("Введите n: ");
		int n = in.nextInt();
		int a = m-1;
	int p =0;
	while (a<n) {
		a=1+a;
			for (int i=2; i<a; i++) {
			if (a%i ==0) {
				System.out.println(a+"  " +i);}
			//a = a+1;
			}
			
		//break;
			
			  }
		
	    
	}}
