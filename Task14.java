package by.htp.les04.main;
//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.  

public class Task14 {
	
public static void main(String[] args) {

double a = 1;
double p = 0;
 for (double n = 1; n<=3; n++) {
	 a = 1/n;
	p = p+a;
	    
 }
 System.out.println(p);
	}
	
	
}
