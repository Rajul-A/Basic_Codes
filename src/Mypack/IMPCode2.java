package Mypack;

import java.util.stream.Collectors;
import java.util.*;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class IMPCode2 {
	// @Test
	public void printDulicateCharaterFromString() {
		String s = "rraajjuull";
		StringBuffer sb = new StringBuffer();
		Set<Character> s1 = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!s1.contains(ch)) {
				s1.add(ch);
				sb.append(ch);
			}
		}
		System.out.println("Removed all duplicate charater form string" + " " + sb.toString());
	}

	//@Test
	public void reverseWordFromStringWithoutAffectingCharaterValue(){
		String s = " My name is rajul  ";
		int i = s.length() - 1;
		int j = 0;
		StringBuilder s1 = new StringBuilder();
		String ans = "";

		while (i > 0) {
			while (i >= 0 && s.charAt(i) == ' ') {
				i--;
			}
			j = i;

			while (i >= 0 && s.charAt(i) != ' ') {
			
				i--;
			}
			if (s1.equals("")) {
				s1.append(s.substring(i + 1, j + 1));
			} else {
				s1.append(" " + s.substring(i + 1, j + 1));
			}
		}
		System.out.println("Reverse words of character =" + " " + s1);
	}
	
	//@Test
	public void arrayList() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(10);
		a.add(60);
		a.add(60);
		a.add(22);
		a.add(28);
		a.add(null);
		a.add(null);
		a.add(null);
		
		Iterator it = a.listIterator();//Returns a list iterator over the elements in this list 
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		System.out.println("index Value is " + " " + a.get(3));
		if(a.get(5) == 22) {
			a.remove(5);
		}
		System.out.println(a);
	}
	
	//@Test
	public void setInterface() {
	    Set<String> set = new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }
	}

	//@Test
	public void aSkipTest() {  
		String condition = "Skip";
		if(condition.equals("Skip")){
			throw new SkipException("This test case is not ready to execute");
		}
		else {
			System.out.println("I am Ready");
		}
		System.out.println("it is resolved now");
	}
	
	
	//@Test
	public void isStringAnagram() {
		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		
		char[] array1 = a.toCharArray();
		System.out.println(array1);
		char[] array2 = b.toCharArray();
		System.out.println(array2);
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		boolean status = Arrays.equals(array1, array2);
		if(status) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}	
 	}
	
	//@Test
	public void findSecondMaxCharFromString(){
		String s = "abcd";
		char max;
		
		char[] array = s.toCharArray();
		
		Arrays.sort(array);
		
		for(int i = 0 ; i < s.length(); i++){
			System.out.println(array[i]);
		}
		System.out.println("Second max charater in the string " + " " + array[array.length-2]);
	}
	
	//@Test
	public void pattern() { 
		int num = 5;
		for(int i = 0 ; i < num; i++) {
			for(int j = 0; j < i; j++) {
			 System.out.print(" ");
			}
			
			for(int j = num; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
		 */
	}
	
	//@Test
	public void pattern1(){
		int num = 5;
		for(int i = 0 ; i < num; i++) {
			for(int j = num; j > i; j--) {
			 System.out.print(" ");
			}
			
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
	* 
   * * 
  * * * 
 * * * * 
		 */
	}
	
	//@Test
	public void pattern2() {
		int num = 5;
		
		for(int i = 0 ; i < num; i++) {
			for(int j = num; j > i; j--) {
			 System.out.print(" ");
			}
			
			for(int j = 0; j < i; j++) {
				
				System.out.print((char) (j + 65) + " ");
			}
			System.out.println();
		}
 /* A 
   A B 
  A B C 
 A B C D */

	}
	//@Test
	public void pattern3() {
		int num = 5;
		int alphabate = 64;
		for(int i = 0 ; i < num; i++) {
			for(int j = num; j > i; j--) {
			 System.out.print(" ");
			}
			
			for(int j = 0; j < i; j++) {
				
				System.out.print((char) alphabate + " ");
			}
			alphabate++;
			System.out.println();
		}
/*  A 
   B B 
  C C C 
 D D D D */
	}
	
	//@Test
	public void countOpenAndCloseBracket(){
		String s = "((()))";
		int openBracket = 0;
		int closeBracket = 0;
		
		for(int i = 0 ; i < s.length(); i++) {
			char c = s.charAt(i);
		
			
			if(c == '(') {
				openBracket++;
			}
			else if(c == ')') {
				closeBracket++;
			}
			else {
				System.out.println("String in invalid");
				break;
			}
		}
		System.out.println(openBracket + " " + closeBracket);
		
	}
	//@Test
	void steramExa() {
	    List names = Arrays.asList("Reflection","Collection","Stream");
	    Object result = names.stream().sorted().collect(Collectors.toList());
	    System.out.println(result);
	}
	
	//@Test
	void ankushCode() {
		String s = "my name rajul agrawal I am searching am job";
		String[] abc =s.split(" ");
		Map<String, Integer> m = new HashMap<>();
		
		for(int i = 0 ; i < abc.length; i++) {		
			char c= s.charAt(i);
//			if(m.containsKey(abc[i])) {
//				
//				m.put(abc[i], m.get(abc[i]) + 1);
//				
//			}
//			else {
//				m.put(abc[i], 1);
//			}	
			System.out.println(c);
		}
		
	}
	
	//@Test
	public void printPrimeNumber(){
		int num = 100;
		int count = 0;
		int i = 0;
		int countOfPrimeNumbers = 0;
		
		for(i = 2; i < num; i++){
			count = 0;
			for(int j = 2 ; j < i; j++){
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 0) {
				countOfPrimeNumbers++;
				
				System.out.println(i);
			}
		}
		System.out.println("Count of prime numbers are from 1 to 100 :" + " " + countOfPrimeNumbers);
		
	}
	
	@Test
	public void isNumberPrime() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			if(num%i == 0) {
				System.out.println("Number is prime");
			}
			else {
				System.out.println("Number is not prime");
			}
		}
	}
	
	
}
