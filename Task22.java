package by.htp.les04.main;
//Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
//Результат представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие значения функции:  F(x) = sin2(x)

public class Task22 {
	
public static void main(String[] args) {
double a = 1;
double b = 2;
double h = 0.5;
double x = a;
double y;
while (x<=b)
{

	  y = Math.pow(Math.sin(x), 2);
		System.out.println(x +"   "+y);   
	x = x+h;

	 }
 
		}}
		
		
