package by.htp.les04.main;
//Составить программу нахождения разности кубов первых двухсот чисел 

public class Task11 {
	
public static void main(String[] args) {
	long a = 2;
     for (int i=1; i<201; i++)
a = (long) (a - (Math.pow(i, 3)));
  
    System.out.println(a);
}}
