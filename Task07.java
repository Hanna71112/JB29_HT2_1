package by.htp.les04.main;
//Вычислить значения функции на отрезке [а,b] c шагом h: 

import java.util.Scanner;

public class Task07 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите a: ");
     int a = in.nextInt();
     System.out.print("Введите b: ");
     int b = in.nextInt();
     System.out.print("Введите h: ");
     int h = in.nextInt();
   int y = 0;
	int x = a;
   while (x<=b)
	   
   { if (x >2) {
	   y = x;	   }
	   else if (x<=2) {
	   y = -x;}
	  
    x+=h;
    System.out.println(y);
}}}
