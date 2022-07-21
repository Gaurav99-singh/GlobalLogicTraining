package com.globallogic.collections;

/*Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , 
sort the list and print.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		//adding elements
		list.add("Gaurav");
		list.add("Aman");
		list.add("Amit");
		list.add("Piyush");

		System.out.println(list);

		//removing or deleting elements
		list.remove("Aman");
		System.out.println(list);
		
		
		//updating element
		list.set(2,"Hello");
		System.out.println(list);
		
		
		//sorting list
		Collections.sort(list);
		System.out.println(list);
		

		
	}

}
