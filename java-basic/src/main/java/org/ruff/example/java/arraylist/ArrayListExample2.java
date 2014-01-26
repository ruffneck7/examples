package org.ruff.example.java.arraylist;

import java.util.*;

public class ArrayListExample2 {

	public static void main(String args[]) {
		// Creating an empty array list
		ArrayList<String> list = new ArrayList<String>();

		list.add("Item1");
		list.add("Item2");
		list.add(2, "Item3");
		list.add("Item4");
		list.add("Item4");
		
		System.out.println(list);
		
		list.remove("Item4");
		
		System.out.println(list);
		
		class TestObect {
			
			private String name;
			
			public TestObect(String name) {
				this.name = name;
			}
			
			@Override
			public String toString() {
				return "TestObect [name=" + name + "]";
			}
		}
		
		
		TestObect to1 = new TestObect("Test1");
		TestObect to2 = new TestObect("Test2");
		TestObect to3 = new TestObect("Test3");
		
		ArrayList<TestObect> list2 = new ArrayList<TestObect>();
		list2.add(to1);
		list2.add(to2);
		list2.add(to3);
		list2.add(to2);
		
		System.out.println(list2);
		
		// Removing to2 
		list2.remove(to2);
		
		// The remove method removes the first matched one 
		System.out.println(list2);
	}
}
