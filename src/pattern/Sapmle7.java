package pattern;

import java.util.Scanner;

public class Sapmle7
{
	public static void main(String[] args) {
		
		System.out.println("enter number here : ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		int factorial = 1;
		
		for(int i=num; i>=1; i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
