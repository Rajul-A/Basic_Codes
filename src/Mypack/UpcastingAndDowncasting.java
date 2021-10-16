package Mypack;


//class UpcastingAndDowncasting{
//	public static void main(String[] args) {
//
//	}
//}

//There is an important point. If a super class method 
//is overridden in sub class then up cast reference will use overridden method without downcast.
class SuperClass {
	public void superMethod() {
		System.out.println("Super Print");
	}
}
class SubClass extends SuperClass {

	public void subMethod() {
		System.out.println("Sub Print");
	}
}
class UpcastingAndDowncasting{
	public static void main(String[] args) {
		SuperClass superClass = new SubClass();// upcasting 
		superClass.superMethod();
		
		SubClass subClass = (SubClass) superClass; // Downcasting
		subClass.subMethod();
	}
}
 
//class SuperClass1 {
//	public void super_print() {
//		System.out.println("Super Print");
//	}
// 
//	public void super_show() {
//		System.out.println("Super Show");
//	}
//}
// 
//class SubClass1 extends SuperClass1 {
// 
//	public void sub_print() {
//		System.out.println("Sub Print");
//	}
// 
//	public void sub_show() {
//		System.out.println("Sub Show");
//	}
//}
//	
//	
//public class UpcastingAndDowncasting{
//	public static void main(String[] args) {
// 
//		/* Child class object up cast to super class reference. Using super class reference , 
//		 * sub class object can not use methods
//		 of sub class despite of being object of that class. Up casting restricts access or
//		  visibility of methods downwards */
//		SuperClass1 superClass1 = new SubClass1();
//		superClass1.super_print();
//		superClass1.super_show();
////		
//		
//		/* To access sub class methods, super class reference needs to be downcast to sub class reference.
//		 *  Note here we can down cast
//		to a up cast reference only. */
//		SubClass1 subClass1 = (SubClass1) superClass1;
//		subClass1.sub_print();
//		subClass1.sub_show();
//		
// 
//	}
//}