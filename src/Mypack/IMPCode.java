package Mypack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.testng.annotations.Test;
public class IMPCode {
	// @Test
	public void findMax() {
		int[] arr = { 2, 1, 3, 4, 8, 9 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max element is " + " " + max);

	}

	// @Test
	public void findMin() {
		int[] arr = { 2, 1, 3, 8, 4, 9 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min element is " + " " + min);
	}

	// @Test
	public void findKthElement() {
		int[] arr = { 2, 1, 3, 8, 4, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorting");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		System.out.println("Second Highest Number" + " : " + arr[arr.length - 2]);
	}

	// @Test
	public void removeDuplicates() {
		int[] arr = { 2, 1, 2, 5, 4, 5, 3, 7, 3, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorting");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

		int l = 0;
		System.out.println("After removing the duplicates from array");
		for (int h = 0; h < arr.length - 1; h++) {
			if (arr[h] != arr[h + 1]) {
				arr[l++] = arr[h];
			}

		}
		arr[l++] = arr[arr.length - 1];

		System.out.println("After removing duplicate elements");
		for (int i = 0; i < l; i++) {
			System.out.println(arr[i]);
		}
	}

	// @Test
	public void findTheOccurenceOfElement() {
		int[] arr = { 2, 1, 2, 5, 4, 5, 3, 7, 3, 7 };
		int count = 1;
		int visited = -1;
		int[] fr = new int[arr.length];
		System.out.println("Check number of Occurence are :");
		for (int i = 0; i < arr.length; i++) {
			count = 1;

			if (arr[i] != visited) {

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = visited;
					}
				}
				fr[i] = count;
			}

		}
		System.out.println("Total occurence are:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != visited)
				System.out.println(arr[i] + " || " + fr[i]);
		}

	}

	// @Test
	public void mapIteration() {
		Map<Integer, Integer> l = new HashMap<>();
		l.put(1, 2);
		l.put(2, 4);
		l.put(3, 2);
		l.put(4, 4);
		l.put(5, 3);
		l.put(6, 3);
		l.put(7, 4);

		Set<Entry<Integer, Integer>> s = l.entrySet();

		Iterator<Entry<Integer, Integer>> itr = s.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> m = itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	// @Test
	public void AddElementInArray() {
		int[] arr = { 2, 1, 2, 5, 4, 5, 3, 7, 3, 7 };
		int addElement = 100;
		int indexNumber = 2;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;

			if (count == indexNumber) {
				arr[i] = addElement;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// @Test
	public void AddElementWithoutOverriding() {
		int[] arr = { 10, 20, 30, 40, 50 };
		int addElement = 100;
		int pos = 2;
		for (int i = arr.length - 1; i > pos - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos - 1] = addElement;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// @Test
	public void removeElementFromArray() {
		int[] arr = { 10, 20, 30, 40, 50 };
		int pos = 2;
		int x = 20;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				break;
			}

		}

		for (i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

	}

	// @Test
	public void missingElement() {
		int[] arr = { 1, 2, 3, 5, 6 };
		int sumOfArray = 0;
		int last = arr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			sumOfArray = sumOfArray + arr[i];
		}
		System.out.println(sumOfArray);
		int actualSum = last * (last + 1) / 2;
		int findMissing = actualSum - sumOfArray;
		System.out.println(findMissing);
	}

	// @Test
	public void reverseString() {
		String s = "rajul";
		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
	}

	// @Test
	public void reverseStringWithoutAddingNewString() {
		StringBuffer s = new StringBuffer("Rajul Ronak Cheeku");
		System.out.println("After Reversing the Array" + " " + s.reverse());

	}

	//@Test
	public void reverseStringBySwappingChar(){
		String s1 = "Geek@ForGeek@s";
		char[] temp = s1.toCharArray();
		int left = 0;
		int right = temp.length - 1;
		for (left = 0; left < right; left++, right--){
			if (temp[left] >='A' && temp[left] <= 'Z' || temp[left] >='a' && temp[left] <= 'z'){
				left++;
			} else if (temp[right] >='A' && temp[right] <= 'Z' || temp[right] >='a' && temp[right] <= 'z') {
				right++;
			} else {
				char temparory = temp[left];
				temp[left] = temp[right];
				temp[right] = temparory;
			}
		}
		System.out.println("Reverse String is :");
		for (char c : temp) {
			System.out.print(c);
		}
	}

	// @Test
	public static void charOccurence(){
		String s = "rajulagrawal";
		Map<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if (m.containsKey(ch)) {
				int count = m.get(ch) + 1;
				m.replace(ch, count);
			} else {
				m.put(ch, 1);
			}
		}
		Set s1 = m.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry<Character, Integer> me = (Map.Entry) itr.next();
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}

	// @Test
	public void removeDuplicatesFromString(){
		String s = "aabbcc";
		StringBuffer sb = new StringBuffer();
		Set<Character> m = new HashSet<>();
		for (int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if (!m.contains(ch)){
				m.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

	//@Test
	public void separateZeroOneMethod1() {
		int[] a = {1,0,0,1,0,1,0,1};
		int[] a1  = new int[a.length];
		int i = 0;
		int j = 0;
		for(i = 0 ; i < a.length; i++){
			if(a[i] == 1) {
				a1[j] = a[i];
				j++;
			}	
		}
		for(i = 0 ; i < a.length; i++) {
			if(a[i] == 0) {
				a1[j] = a[i];
				j++;
			}
		}
		for(i= 0 ; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}
	
	//@Test
	public void separateZeroOneMethod2() {
		int[] a = {1,0,0,1,0,1,0,1};
		int count = 0;
		int j = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				count++;
			}
		}
		for(j = 0 ; j < count; j++ ) {
			a[j] = 0;
		}
		for(j = count; j < a.length; j++) {
			a[j] = 1;	
		}
		for( j = 0 ; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
	//@Test
	public void pattern2() {
		int num = 5;
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
//		***** 
//		**** 
//		*** 
//		** 
//		*
	}
	//@Test
	public void zeroOnePatter() {
		int num = 10;
		for(int i =0; i < num; i++) {
			for(int j = 0 ; j < i; j++) {
				if(j%2 == 0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}	
			}
			System.out.println(" ");
		}
//		0 
//		01 
//		010 
//		0101 
//		01010
	}
	
	//@Test
	public void fabbonacciSeries() {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		int num1 = 0;
		int num2 = 1;
		int size = 10;
		int sum = 0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 2; i < size; i++){
			sum= num1 + num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
		}
	}
	
	//@Test
	public void palindromeString() {
		String str1 = "BOB";
		String str2 = "";
	
		for(int i = str1.length() -1 ; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		
		if(str1.equals(str2)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}	
	}
	
}
