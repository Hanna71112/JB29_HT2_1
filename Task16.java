package by.htp.les04.main;
// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). 

public class Task16 {
	
public static void main(String[] args) {

	long a = 1;
	long p = 1;
	 for (long n = 2; n<=12; n++) {
		 a = a +n;
p = p*a;
  
	 }
	 System.out.println(p);     
		}}
		
		
