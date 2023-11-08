package ui;

import java.util.Scanner;

import model.Controller;

public class Executable {

	public Scanner reader;
	public Controller contoller;

	public static void main(String[] args) {

		Executable documentCodeManager = new Executable();
		documentCodeManager.showMenu();

	}

	public Executable() {
		reader = new Scanner(System.in);
		contoller = new Controller();
	}

	public void showMenu() {
		int option = 0;
		do {

			System.out.println("Welcome to the Document Code Manager");

			System.out.println("\nPlease pick an option\n"
					+ "(1) Create a Document \n"
					+ "(2) Show documents registered \n"
					+ "(0) Close the application");
			option = reader.nextInt();
			
			switch (option) {
				case 0:
					System.out.println("Thanks for using our services!");
					break;
				case 1:
					registerDocument();
					break;
				case 2:
					System.out.println(contoller.showDocuments()+"\n");
					break;

				default:
					System.out.println("Error, type a valid option");
					break;

			}

		} while (option != 0);
	}

	public void registerDocument() {
		
		reader.nextLine();

		System.out.println("Please type the new Document's name");
		String name = reader.nextLine();

		System.out.println("Please type the new Document's year");
		int year = reader.nextInt();
		reader.nextLine();

		if (contoller.registerDocument(name, year)) {

			System.out.println("Document registered succesfully\n");

		} else {

			System.out.println("Error, Document couldn't be registered\n");

		}
	}

}
