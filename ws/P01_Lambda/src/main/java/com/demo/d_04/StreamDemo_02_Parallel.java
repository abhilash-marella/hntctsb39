package com.demo.d_04;

import java.util.List;

public class StreamDemo_02_Parallel {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z");

		list.stream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEach(System.out::print);

	}
}
