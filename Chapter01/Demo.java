package org.packt.selenium;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apples", "Oranges", "Bananas",
				"Pears");

		fruits.stream().forEach(fruit -> System.out.println(fruit));
	}
}
