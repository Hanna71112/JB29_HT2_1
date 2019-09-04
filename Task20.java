package by.htp.les04.main;
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//модуль которых больше или равен заданному е. Общий член ряда имеет вид: 

public class Task20 {
	
public static void main(String[] args) {
double e = 0.013;
double a = 0;
double p = 0;

	 for (double n = 1; n<=10; n++) {
		a = (1/((3*n-2)*(3*n+1)));
		if (Math.abs(a)>=e)
			p = p+a;

	 }
		System.out.println(p);    
		}}
		
		
