package by.htp.les04.main;
//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) 

public class Task17 {
	
public static void main(String[] args) {

	int a = 1;
	int n = 3;
	int p = 1;
	 for (int i = 0; i<=n-1; i++) {
		
p = p*(a+i);
System.out.println(a+ "   "+p);     
	 }
	
		}}
		
		
