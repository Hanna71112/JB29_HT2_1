package by.htp.les04.main;
//Требуется определить факториал числа, которое ввел пользователь.

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите a: ");
		int a = in.nextInt();
		int n=1;
	
	  for (int i=1; i<=a; i++)
	  {
		  n = n*i;
	  }
		System.out.println(n);
	    
	}}
