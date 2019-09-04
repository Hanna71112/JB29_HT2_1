package by.htp.les04.main;
//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 
//Составьте программу нахождения произведения первых 10 членов этой последовательности

public class Task12 {
	
public static void main(String[] args) {
long a = 1;
long p = 1;
	for ( int i = 1; i<10 ; i++)	{
		
	a = 6+a;
    p=p*a;
}
	System.out.println(p);
}
}