package Collections;

import java.util.*;
import java.io.*;

public class Arraylistexample {

	public static void main(String[] args) {
//		int n=5;
//		
//	  ArrayList arli = new ArrayList<Integer>(n);
//	  for (int i=0;i<n;i++) {
//		  arli.add(i);
//		  System.out.println(arli);
//	  }
//	arli.remove(3);
//	System.out.println(arli);
//		ArrayList<String> srudent = new ArrayList<>();
//	 srudent.add("Mahima");
//	 System.out.println(srudent);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		list.add(4);
		System.out.println(list);
		list.add(5);
		System.out.println(list);
		list.add(2, 10);
		System.out.println(list);
		List<Integer> newList = new ArrayList<>();
		newList.add(150);
		System.out.println(newList);
		newList.add(190);
		newList.add(50);
		System.out.println(newList);
		newList.addAll(newList);
		System.out.println(newList);
		System.out.println(newList.get(4));
		newList.remove(0);
		System.out.println(newList);
		newList.remove(Integer.valueOf(50));
		System.out.println(newList);
		newList.set(2, 1);
		System.out.println(newList);
		System.out.println(newList.contains(50));
		System.out.println(newList);

		for(Integer number:newList) {
			System.out.println("foreach the number is :"+number);
		}

		for (int i = 0; i < newList.size(); i++) {
			System.out.println("With for the numbwr is :"+newList.get(i));
//
		}
		Iterator<Integer> it = newList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
