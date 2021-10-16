package Mypack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
class TestClass{
	
}
public class ServiceA extends TestClass {

	public void getAllDetails() {
		super();
		
	}
		
	
	
	
	

}

//		Map<Integer, String> m = new HashMap<>();
//		m.put(1, "Rajul");
//		m.put(2, "Rahul");
//		m.put(3, "Aam");
//		m.put(4, "Tajul");
//		m.put(5, "Hajul");
//		m.put(6, "Bajul");

//      1.	Iterating over Map.entrySet() using For-Each loop :		
//		for(Map.Entry<Integer, String> m1 : m.entrySet()) {
//			System.out.println(m1.getKey() + " " + m1.getValue());
//		}

//		2. Iterating over keys or values using keySet() and values() methods  
//		for(Integer key: m.keySet()) {
//			System.out.println("Keys :"  + " " + key);
//		}
//		for(String value: m.values()) {
//			System.out.println("Values :" + " " + value);
//		}

//		3. Iterating using iterators over Map.Entry<K, V>
//		Iterator<Entry<Integer, String>> it = m.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry<Integer, String> mp = it.next();
//			System.out.println(mp.getValue() + " " + mp.getKey());
//			
//		}

//public class ServiceA
//{
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please take a string as input");
//		String s = sc.next();
//		String reversedString = "";
//		for(int i = s.length()-1; i >= 0 ; i--) {
//			reversedString = reversedString + s.charAt(i);
//		}
//		
//		if(s.equals(reversedString)) {
//			System.out.println("String is palindrome");
//		}
//		else {
//			System.out.println("String is not palindrome");
//		}
//	
//	}
//}
//Superclass
//class Base {
//   
// // Static method in base class which will be hidden in subclass 
// public static void display() {
//     System.out.println("Static or class method from Base");
// }
//   
//  // Non-static method which will be overridden in derived class 
//  public void print()  {
//      System.out.println("Non-static or Instance method from Base");
// }
//}
//
////Subclass
//class Derived extends Base {
//   
// // This method hides display() in Base 
// public static void display() {
//      System.out.println("Static or class method from Derived");
// }
//   
// // This method overrides print() in Base 
// public void print() {
//      System.out.println("Non-static or Instance method from Derived");
//}
//}
//
////Driver class
//public class ServiceA {
// public static void main(String args[ ])  {
//    Base obj1 = new Base();
//      
//    // As per overriding rules this should call to class Derive's static 
//    // overridden method. Since static method can not be overridden, it 
//    // calls Base's display() 
//    obj1.display();  
//      
//    // Here overriding works and Derive's print() is called 
//    obj1.print();     
// }
//}

//
//class Person {
//	int id;
//	String name;
//
//	Person(int id, String name) {
//		System.out.println("Done");
//		this.id = id;
//		this.name = name;
//	}
//}
//
//class Emp extends Person {
//	float salary;
//
//	Emp(int id, String name, float salary) {
//		super(id, name);// reusing parent constructor
//		this.salary = salary;
//	}
//
//	void display() {
//		
//		System.out.println(id + " " + name + " " + salary);
//	}
//	
//}
//
//class ServiceA {
//	public static void main(String[] args) {
//		Emp e1 = new Emp(1, "ankit", 45000f);
//		e1.display();
//	}
//}

//class Cars{
//	
//	public static void runCar() {
//		System.out.println("runCar");
//	}
//}
//
//class Bus extends Cars{
//	public static void runCar() {
//		System.out.println("runBus");
//	}
//}
//class ServiceA{
//	public static void main(String[] args) {
//		
//		Cars c = new Bus();
//		c.runCar();
//	}
//	
//}
//

//class Parent {
//	String msg;
//
//	Parent() {
//
//		msg = "Line 7";
//	}
//
//	public void printMsg(String msg) {
//		System.out.println(msg);
//	}
//}
//
//class Child extends Parent {
//	
//	
//	public void printMsg(String msg) {
//	
//		super.printMsg(msg);
//		
//		System.out.println("DOne");
//		
//	}
//}
//public class ServiceA{
//	
//
//	public static void main(String[] args) {
//		Child c = new Child();
//		c.printMsg("Line 24");
//	
//	}
//
//}
//interface DemoInterface1 {
//	public default void display() {
//		System.out.println("the display() method of DemoInterface1 invoked");
//	}
//}
//
//interface DemoInterface2 {
//	public default void display() {
//		System.out.println("the display() method of DemoInterface2 invoked");
//	}
//}
//
//class DemoClass implements DemoInterface1, DemoInterface2 {
//	public void display() {
//		DemoInterface1.super.display();
//		DemoInterface2.super.display();
//	}
//}
//
//public class ServiceA {
//	public static void main(String args[]) {
//		DemoClass obj = new DemoClass();
//		obj.display();
//	}
//}