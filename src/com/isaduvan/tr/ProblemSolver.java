package com.isaduvan.tr;

public class ProblemSolver {
	
    double a,b,c;
	
    public ProblemSolver(double a, double b, double c) {
    	
    	this.a = a;
    	this.b = b;
    	this.c = c;
    	
    }
	
	public  double findFirstX () {
		double x1 = 0;
		x1 = ((-b-Math.sqrt(findDelta())/(2*a)));
		return x1;
	}
	public  double findSecondX () {
		double x2 = 0;
		x2 = ((-b+Math.sqrt(findDelta())/(2*a)));
		return x2;
	}
	public double findDelta () {
		
		double delta = 0;
		
		delta = Math.pow(b, 2)- (4*a*c);
		
		return delta;
	}

}
