package com.kodewala;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample1 {

	public static void main(String[] args) {
		Map<Integer, Integer> marks = new HashMap<Integer, Integer>();
		marks.put(101, 45);
		marks.put(789, 88);
		marks.put(456, 79);
		marks.put(785,46);
		marks.put(101, 85);
		marks.put(102, 78);
		marks.put(103, 90);
		System.out.println(marks.get(102));

	}

}
