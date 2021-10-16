package Mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class StreamTutorial{
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Rajul");
		list.add("Rahul");
		list.add("Rishabh");
		list.add("Ronak");
		list.add("Amit");
		list.add("Aman");
		list.add("Juhi");
		list.add("Vaishnavi");
		list.add("Srashti");
//		num.stream().distinct().forEach(s->System.out.println(s));
//		List<Integer> list2 = Arrays.asList(1,2,3,2,2,3,1);
		list.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));

		list.stream().sorted().forEach(s->System.out.println("Soreted list are:" + " " +  s));	
	}
}



//		List<String> list = new ArrayList<String>();
//		list.add("Rajul");
//		list.add("Rahul");
//		list.add("Rishabh");
//		list.add("Ronak");
//		list.add("Amit");
//		list.add("Aman");
//		list.add("Juhi");
//		list.add("Vaishnavi");
//		list.add("Srashti");
//		// Normal code - without using stream
////		int count = 0;
////		for(int i = 0; i<list.size(); i++) {
////			String str = list.get(i);
////			if(str.startsWith("R")) {
////				count++;
////			}
////		}
////		System.out.println(count);
//		// using Stream
//		//without terminal operation it is useless
//		//terminal operators will be execute only if filters returns true else it does not print anything
//		long countR = list.stream().filter(s->s.startsWith("R")).count();
//		System.out.println(countR);
//		long countA = list.stream().filter(s->s.startsWith("A")).count();
//		System.out.println(countA);
	//	list.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
//		//Whenever modification is required like upperCase you can use map() 
//		list.stream().filter(s->s.length()>5).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//		list.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//		
//		List<String> list1 = new ArrayList<String>(); 
//		list1.add("Don");
//		list1.add("Man");
//		list1.add("Woman");
//		
//		Stream<String> newStream = Stream.concat(list.stream(), list1.stream());// Adding two stream
//		newStream.sorted().forEach(s->System.out.println(s));
//		
//		
//		// Convert int arrya to List===========================================================
////		int array[] = {1,8,5,7 };
////		List<Integer> l = new ArrayList<Integer>(array.length);
////		for(int i: l) {
////			l.add(Integer.valueOf(i));
////		}
////		System.out.println(list);
//		
//		
//		
//		
//		Collec()===================================
//		List<String> list = new ArrayList<String>();
//		list.add("Rajul");
//		list.add("Rahul");
//		list.add("Rishabh");
//		list.add("Ronak");
//		list.add("Amit");
//		list.add("Aman");
//		list.add("Juhi");
//		list.add("Vaishnavi");
//		list.add("Srashti");
//		
//		List<String> list1 = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
//		list1.stream().filter(s->s.startsWith("R") && s.endsWith("L")).forEach(s->System.out.println(s));
//		System.out.println(list1);e

		
		//list2 = list2.stream().distinct().collect(Collectors.toList());
		//System.out.println("hello");

		//list2.stream().forEach(s->System.out.println(s));
		


