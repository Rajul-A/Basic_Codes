package Mypack;

import java.util.Scanner;

class A{
	public static void run() {
		System.out.println("Class A");
	}
}

class B extends A{
	public static void run() {
		System.out.println("class B");
	}
}

public class PrivateKeyWord {
	public static void main(String[] args) {
		
		A a = new B();
		a.run();
		
		
		
		//Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of Array");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		int count = 0;
//		int flag = 0;
//		int flag1 = 0;
//		int j = 2;
//		System.out.println("Enetr the elements:");
//		for (int i = 0; i < size; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < size; i++) {
//			if (arr[i] >= 2 && arr[i] <= 99) {
//				count++;
//			}
//		}
//		if (count != size) {
//			System.out.println("Invalid Array");
//		}
//
//		else {
//			System.out.println("Valid Array: ");
//			for (int i = 0; i < size; i++) {
//				flag = 0;
//				if (j < arr[i]) {
//					for (j = 2; j <= i; j++) {
//						if (arr[i] % j == 0) {
//							flag = 1;
//							break;
//						}
//					}
//				}
//				if (flag == 0) {
//					flag1 = 0;
//					if (i >= 2) {
//						for (j = 2; j < i / 2; j++) {
//							if (i % j == 0) {
//								flag1 = 1;
//								break;
//							}
//						}
//
//						if (flag1 == 0) {
//							System.out.println("prime Index at : " + i + " - " + arr[i]);
//
//						}
//					}
//				}
//			}
//		}
	}
}

//How to fetch Private Varibale 
//class Demo {
//	private int age;
//	private String name;
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//
//	
//}
//public class PrivateKeyWord{
//
//	public static void main(String[] args) {
//		Demo d  = new Demo();
//		d.setAge(10);
//		d.setName("Rajul");
//		System.out.println(d.getAge() + " " + d.getName());
//	}
//}
//
//class SingletonDemo{
//	
//	private static SingletonDemo sd = new SingletonDemo();
//	public String s;
//	
//	private SingletonDemo() {
//		s = "Done";
//	}
//	public static SingletonDemo getInstance() {
//		if(sd == null) {
//			sd = new SingletonDemo();
//		}
//		return sd;
//	}
//	
//	
//}
//class PrivateKeyWord{
//	public static void main(String[] arg) {
//		SingletonDemo pw = SingletonDemo.getInstance();
//		System.out.println(pw.s);
//	
//	}
//}
