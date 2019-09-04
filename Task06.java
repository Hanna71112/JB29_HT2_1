package by.htp.les04.main;
//Напишите программу, где пользователь вводит любое целое положительное число. 
//А программа суммирует все числа от 1 до введенного пользователем числа. 

import java.util.Scanner;

public class Task06 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите целое положительное число: ");
     int a = in.nextInt();
   int sum = 0;
	
   for (int i=1; i<=a; i++) {
	sum =sum+i;}
	
	 System.out.println(sum);

}}

