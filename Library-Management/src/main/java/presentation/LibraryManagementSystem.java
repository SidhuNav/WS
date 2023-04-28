package presentation;

import java.util.List;
import java.util.Scanner;

import model.BookPojo;
import service.BookService;
import service.BookServiceImpl;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		char proceed='y';
		Scanner sc=new Scanner(System.in);
		while(proceed=='y')
		{
			System.out.println("***********************************************************");
			System.out.println("               Library Management System                  ");
			System.out.println("***********************************************************");
			System.out.println("      1. List all the Books in the library");
			System.out.println("      2. Add Books in the library");
			System.out.println("      3. Remove Books from the library");
			System.out.println("      4. Update Books in the library");
			System.out.println("      5. EXIT");
			System.out.println("***********************************************************");
			System.out.println("              Please Select an option");
			int option= sc.nextInt();
			System.out.println("***********************************************************");
			switch(option) {
			case 1:
				List<BookPojo> everyBook=bookService.readAllBooks();
				System.out.println("***********************************************************");
				System.out.println(" Book Id \t Name\t Book Description\t Author Name \t Publisher Name");
				System.out.println("***********************************************************");
				
				for(BookPojo ab: everyBook)
				{
					System.out.println(ab.getBook_id()+"\t"+ab.getBook_name()+"\t"+ab.getBook_description()+"\t"+ab.getAuthor_name()+"\t"+ab.getPublisher_name());
				}
				System.out.println("do you want to continue ? (y/n)");
				proceed=sc.next().charAt(0);
				break;
			case 2:
				BookPojo nb= new BookPojo();
				System.out.println("Enter Book Name = ");
				sc.nextLine();
				nb.setBook_name(sc.nextLine());
				System.out.println("Enter Book Description = ");
				nb.setBook_description(sc.nextLine());
				System.out.println("Enter Author Name = ");
				nb.setAuthor_name(sc.nextLine());
				System.out.println("Enter Publisher Name = ");
				nb.setPublisher_name(sc.nextLine());
				//bookService.addBook(nb);
				bookService.addBook(nb);
					
				break;
			case 3:
				System.out.println("Enter product id = ");
				int proId=sc.nextInt();
				bookService.readABook(proId);
				break;
			case 4:
				break;
			case 5:
				System.out.println("***********************************************************");
				System.out.println("Thank you for using Library Management System!!!!!");
				System.out.println("***********************************************************");
				System.exit(0);
			default:
					
			}	
		}
		System.out.println("***********************************************************");
		System.out.println("Thank you for using Library Management System!!!!!");
		System.out.println("***********************************************************");
	}

}
