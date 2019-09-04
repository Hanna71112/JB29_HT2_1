package by.htp.les04.main;
//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5. 

public class Task13 {
	
public static void main(String[] args) {
double y=1;
double h=0.5;
double x=-5;

	while (x<=5) {
		y = 5 - Math.pow(x, 2)/2;  
	    System.out.println(x +"   " +y);
		x = x+h;
	
	}
	
	
}
}