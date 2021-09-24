package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Annotation telling us that this is spring boot application
 * 
 * This is the main class that executes right at the right.
 */

@SpringBootApplication
public class TitanicApplication {

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Runs the spring application
		 */

		SpringApplication.run(TitanicApplication.class, args);

		CSVLoader csvLoader = new CSVLoader();

		/*
		 * Calling the connect method in csvLoader class
		 */
		csvLoader.Connect();

		System.out.println("Titanic Data Has Been Loaded");

	}

}
