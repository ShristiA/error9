package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

	ArrayList<String> items = new ArrayList<>();

	items.add("module");
	items.add("class");
	items.add("implement");

	Random r = new Random();
	int itemIndex = r.nextInt(items.size());
	// we are getting random index from the array list by using random class.
	String item = items.get(itemIndex);
	//getting value at the random index.

	System.out.println(item);

    }
}
