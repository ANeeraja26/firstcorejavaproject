package com.task;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplaceAllElementsForIndex {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		Iterator<Integer> itr = list.iterator();

		int index = 0;

		while (itr.hasNext()) {
			itr.next();
			

			if (index % 2 == 0) {
				itr.remove();
				list.add(index, 0);

			}
			index++;

		}
		System.out.println(list);

	}

}
