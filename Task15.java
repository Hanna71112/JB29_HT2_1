package by.htp.les04.main;
// Вычислить : 1+2+4+8+...+ 2 в 10 степени  

public class Task15 {
	
public static void main(String[] args) {

int a = 1;
int p =0;
while (a<=Math.pow(2, 10))
{
	p = p+a;
a = a+a;
System.out.println(p);


	 }
	}
	
	
}
