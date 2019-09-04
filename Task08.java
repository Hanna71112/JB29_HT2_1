package by.htp.les04.main;
//Вычислить значения функции на отрезке [а,b] c шагом h: 

import java.util.Scanner;

public class Task08 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите a: ");
     int a = in.nextInt();
     System.out.print("Введите b: ");
     int b = in.nextInt();
     System.out.print("Введите h: ");
     int h = in.nextInt();
     int c = 1;
   int y = 0;
	int x = a;
   while (x<=b)
	   
   { if (x == 15) {
	   y = (x+c)*2;	   }
	   else if (x !=15) {
		   y = (x-c)+6;	}
	  
    x+=h;
    System.out.println(y);
}}}
