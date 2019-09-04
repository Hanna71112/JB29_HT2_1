package by.htp.les04.main;
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//модуль которых больше или равен заданному е. Общий член ряда имеет вид: 

public class Task18 {
	
public static void main(String[] args) {
double e = 0.2;
double a = 0;
double p = 0;

	 for (double n = 1; n<=10; n++) {
		a = (Math.pow(-1, (n-1))/n);
		if (Math.abs(a)>=e)
			p = p+a;
	 
	 }
		System.out.println(p);    
		}}
		
		
