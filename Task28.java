package by.htp.les04.main;
//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить результат Z в зависимости от знака. 
//Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа 
//(т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’. 

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
	

		int Z;
	while (true)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Введите X: ");
		int X = in.nextInt();
		System.out.print("Введите Y: ");
		int Y = in.nextInt();
		System.out.print("Введите знак операции: ");
		char a =in.next().charAt(0);
		 if (a == '+') {
			Z = X + Y;
		 System.out.println("Z = "+Z); }
		 else if (a == '-') {
				Z = X - Y;
				System.out.println("Z = "+Z); }
		 
		 else	 if (a == '/') {
				Z = X / Y;
				{ if (Y==0)								{	System.out.println("Деление на ноль");}
				System.out.println("Z = "+Z);}}
				
				else	 if (a == '*') {
				Z = X * Y; 
				System.out.println("Z = "+Z);}
		 
		 if (a != '/'&& a != '+' && a != '-' &&a != '*' )		 {
			 System.out.println("Неверный знак!");
			 }
		 if (a == '0') {
			 break;
			  }
		
	    
	}}}
