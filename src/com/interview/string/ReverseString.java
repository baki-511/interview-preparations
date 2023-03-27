package com.interview.string;

import java.util.Scanner;

public class ReverseString {
	public void reverseMiddleName(String str) {
		
	}
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string --> ");
		String name = sc.nextLine();
		r.reverseMiddleName(name);
	}
}
