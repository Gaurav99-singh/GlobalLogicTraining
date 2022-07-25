package com.globallogic.lambda;

public class LambdaAssignment {

	public static void main(String[] args) {

		// Create a lambda to find the even and odd value

		System.out.println("************Ques 1*************");

		EvenOdd e = (n) -> {
			if (n % 2 == 0) {
				System.out.println("Even no");
			} else {
				System.out.println("Odd no");
			}
		};

		e.evenOddCheck(5);
		e.evenOddCheck(6);

		System.out.println();

		System.out.println("************Ques 2*************");

		// create a lambda to find the lagrst number

		LargestNumDemo ln = (a, b) -> {

			if (a > b) {
				System.out.println(a + " is the larger no");
			} else {
				System.out.println(b + " is the larger no");
			}
		};
		ln.greatestNum(3, 6);

		System.out.println();

		System.out.println("************Ques 3*************");

		// create a lambda to find the min number

		SmallestNumDemo sn = (a, b) -> {

			if (a > b) {
				System.out.println(b + " is the smaller no");
			} else {
				System.out.println(a + " is the smaller no");
			}
		};
		sn.smallestNum(3, 6);

		System.out.println();

		System.out.println("************Ques 4*************");

		// create a lambda to print the hello world

		PrintDemo1 p1 = () -> {
			System.out.println("Hello World");
		};
		p1.print();

		System.out.println();

		System.out.println("************Ques 5*************");

		// create a lambda to print the sum of 1 to 10 0 number

		SumOneToTen stt = () -> {
			int sum = 0;
			for(int i=1;i<=10;i++) {
				sum = sum + i;
			}
			System.out.println("Sum of numbers from 1 to 10 are : "+sum);
		};
		stt.sumNo();

	}

}
