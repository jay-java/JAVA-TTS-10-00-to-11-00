package core;

import java.util.Scanner;

class ABC {
	public void show() {
		System.out.println("call in abc class");
	}
}

public class P008_UserInput {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of i = ");
		i = sc.nextInt();
		System.out.println("i = " + i);

		ABC obj = new ABC();
		obj.show();
	}
}
