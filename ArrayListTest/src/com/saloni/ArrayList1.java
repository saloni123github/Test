package com.saloni;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		list.add("saloni");
		list.add("tejal");
		list.add("kasim");
		list.add("pavan");
		Iterator<String> itr = list.iterator();
		
		for(String s:list){
		System.out.println(s)
			}

	}

}
