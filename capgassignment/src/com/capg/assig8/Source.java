package com.capg.assig8;

import java.io.*;
import java.util.*;
import java.math.*;

public class Source {
	static Object lock = new Object();
	private static volatile int n;

	public static void main(String[] args) throws IOException {
		final PipedOutputStream po = new PipedOutputStream();
		final PipedInputStream ps = new PipedInputStream(po);
		final Scanner sc = new Scanner(System.in);
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				// complete this function!

				// System.out.println("Enter the number");
				n = sc.nextInt();
				// System.out.println(n);
				try {
					po.write(n);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					po.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				// complete this function!
				int factorial = 1;
				try {
					int a = ps.read();
					// System.out.println(a);

					if (a >= 0 && a <= 33) {
						for (int i = 1; i <= a; i++) {
							factorial = factorial * i;
						}
						System.out.println(factorial);
					}

					else {
						System.out.println("Input mismatch");
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println("An exception has occured!");
		}
	}
}
