package com.isaduvan.tr;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("ax2 + bx + c = 0 denklemi i�in katsay�lar� giriniz");
		
		Scanner input = new Scanner(System.in);
		
		double a = 0, b = 0 ,c = 0 ;
		
		System.out.print("A katsay�s� : ");
		
		a = input.nextDouble();
		
		System.out.print("B katsay�s� : ");

		b = input.nextDouble();
		
		System.out.print("C katsay�s� : ");

		c= input.nextDouble();
		
		input.close();
		
		ProblemSolver solve = new ProblemSolver(a, b, c);
		
		System.out.println("Denklemin delta de�eri : " + solve.findDelta());
		System.out.println("Denklemin birinci k�k de�eri : " + solve.findFirstX());
		System.out.println("Denklemin ikinci k�k de�eri : " + solve.findSecondX());
		
	}

}
