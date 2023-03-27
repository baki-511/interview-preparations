package com.interview.pattern;

public class StarPattern {
	public void printStar(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	public void printPyramid(int n) {
		int m=1;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("   ");
			}
			for(int k=1; k<=2*m-1; k++) {
				System.out.print(" * ");
			}
			System.out.println();
			m++;
		}
	}
	public void mirrorPattern(int n) {
		int m=1;
		for(int i=n; i>=1; i--) {
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=m;k++) {
					System.out.print("*");
				}
			}
			System.out.println();
			m++;
		}
	}
	public static void main(String[] args) {
		StarPattern sp = new StarPattern();
		sp.printStar(5);
		System.out.println("\n===================================================");
		sp.printPyramid(5);
		System.out.println("\n===================================================");
		sp.mirrorPattern(5);
	}
}
