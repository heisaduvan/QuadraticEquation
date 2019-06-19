package com.isaduvan.tr;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("ax2 + bx + c = 0 denklemi için katsayýlarý giriniz");
		
		Scanner input = new Scanner(System.in);
		
		double a = 0, b = 0 ,c = 0 ;
		
		System.out.print("A katsayýsý : ");
		
		a = input.nextDouble();
		
		System.out.print("B katsayýsý : ");

		b = input.nextDouble();
		
		System.out.print("C katsayýsý : ");

		c= input.nextDouble();
		
		input.close();
		
		ProblemSolver solve = new ProblemSolver(a, b, c);
		
		System.out.println("Denklemin delta deðeri : " + solve.findDelta());
		System.out.println("Denklemin birinci kök deðeri : " + solve.findFirstX());
		System.out.println("Denklemin ikinci kök deðeri : " + solve.findSecondX());
		
	}

}
