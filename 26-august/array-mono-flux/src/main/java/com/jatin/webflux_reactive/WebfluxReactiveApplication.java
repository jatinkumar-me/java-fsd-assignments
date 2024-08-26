package com.jatin.webflux_reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebfluxReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxReactiveApplication.class, args);

		// Example array
		String[] fruits = { "Apple", "Banana", "Orange", "Grapes", "Mango" };

		// Create a Flux from an array
		Flux<String> fruitFlux = Flux.fromArray(fruits);

		// Subscribe to the Flux and print each item
		System.out.println("Flux Example:");
		fruitFlux
				.doOnNext(System.out::println)
				.subscribe();

		// Create a Mono from a single item in the array (e.g., the first item)
		Mono<String> singleFruitMono = Mono.just(fruits[0]);

		// Subscribe to the Mono and print the item
		System.out.println("\nMono Example:");
		singleFruitMono
				.doOnNext(System.out::println)
				.subscribe();
	}

}
