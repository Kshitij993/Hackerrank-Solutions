/**
 * 
 * Problem Statement-
 * [Bit Manipulation: Lonely Integer](https://www.hackerrank.com/challenges/ctci-lonely-integer/problem)   
 * [Tutorial](https://youtu.be/k1i6eIpeXak)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
//to test
public class BitManipulationLonelyInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		for (int i = 0; i < n; i++) {
			res ^= sc.nextInt();
		}
		System.out.println(res);
		sc.close();
	}
	
}
