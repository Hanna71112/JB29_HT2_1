package by.htp.les04.main;
//Составить программу нахождения произведения квадратов первых двухсот чисел. 

public class Task10 {
	
public static void main(String[] args) {
	double a = 1;
     for (int i=1; i<201; i++)
a = a * (Math.pow(i, 2));
  
    System.out.println(a);
}}
