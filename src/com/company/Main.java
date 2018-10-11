package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("module");
	al.add("class");
	al.add("implement");
	Random r = new Random();
	for(int i =0; i<3; i++) {
        int x = r.nextInt(3);
        al.listIterator(x);
        System.out.println(al);
    }

    }
}
