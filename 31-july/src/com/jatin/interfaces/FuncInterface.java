package com.jatin.interfaces;

@FunctionalInterface
interface NameSayer {
	void sayMyName(String name);
}

public class FuncInterface {

	public static void main(String[] args) {

		NameSayer ns = new NameSayer() {
			@Override
			public void sayMyName(String name) {
				System.out.println(name);
			}
		};

		ns.sayMyName("Jatin");

		NameSayer ns2 = (String name) -> {
			System.out.println(name);
		};

		ns2.sayMyName("Kumar");
	}
}
