package arma.net.bibliotek;

import java.util.Arrays;

import arma.net.book.BookExample;
import arma.net.person.Employee;
import arma.net.person.Person;
import arma.net.util.Utils;

public class Bibliotek
{
	private BookExample[] books;
	private Person[] borrowers;
	private Employee[] employees;
	private final String name;

	public Bibliotek(String cname)
	{
		name = cname;
	}

	public final void addBook(BookExample bookExample)
	{
		final int size = books.length;
		books = Arrays.copyOf(books, size + 1);
		books[size] = bookExample;
	}

	public final void addEmployee(Employee employee)
	{
		final int size = employees.length;
		employees = Arrays.copyOf(employees, size + 1);
		employees[size] = employee;
	}

	public final void addBorrower(Person person)
	{
		final int size = borrowers.length;
		borrowers = Arrays.copyOf(borrowers, size + 1);
		borrowers[size] = person;
	}

	public final void printBookList() // Illogical, must be string
	{
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < books.length; i++)
		{
			string.append(books[i].toString());
			string.append("\n");
		}
		//return string.toString();
	}

	public final void printBorrowersList() // Illogical, must be string
	{
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < borrowers.length; i++)
		{
			string.append(borrowers[i].toString());
			string.append("\n");
		}
		//return string.toString();
	}

	public final void printEmployeesList() // Illogical, must be string
	{
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < employees.length; i++)
		{
			string.append(employees[i].toString());
			string.append("\n");
		}
		//return string.toString();
	}

	@Override
	public String toString()
	{	
		String booksInfo = Utils.compileString(books);
		String borrowInfo = Utils.compileString(borrowers);
		String employInfo = Utils.compileString(employees);
		
		String allInfo = booksInfo + borrowInfo + employInfo;
		
		return allInfo;
	}
}
