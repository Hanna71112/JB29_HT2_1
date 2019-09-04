package by.htp.les04.main;
//Найти сумму квадратов первых ста чисел. 

public class Task09 {
	
public static void main(String[] args) {
	int a = 0;
     for (int i=1; i<101; i++)
a += Math.pow(i, 2);
  
    System.out.println(a);
}}
