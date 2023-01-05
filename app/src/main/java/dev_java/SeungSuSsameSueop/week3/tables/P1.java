package dev_java.SeungSuSsameSueop.week3.tables;

import java.util.Scanner;

public class P1 {
	int n[] = new int[5];

	int total() {
		int hap = 0;
		for (int i = 0; i < n.length; i++) {
			hap += n[i];
		}
		System.out.println("총합 :" + hap);
		return hap;
	}

	void average(double hap) {
		Double avg = 0.0;
		avg = (double) hap / (n.length);
		System.out.println("평균 : " + avg);
	}

	void initUser() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			System.out.println("입력");
			n[i] = s.nextInt();
		}
		s.close();
	}

	public static void main(String[] args) {
		P1 p1 = new P1();
		p1.initUser();
		p1.total();
		p1.average(0);

	}

}