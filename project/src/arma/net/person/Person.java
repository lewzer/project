package arma.net.person;

import java.util.Arrays;
import java.util.Calendar;

import arma.net.book.Book;
import arma.net.book.BookExample;

public class Person
{

	private final Cprnr cpr;
	private final String name;
	private String address;
	private double balance;
	private double balanceYtd;
	private double balanceLtd;

	private Loan[] loans = new Loan[0];

	private Reservation[] reservations = new Reservation[0];

	public Person(Cprnr ccpr, String cname, String caddress)
	{
		cpr = ccpr;
		name = cname;
		address = caddress;
	}

	public final void Borrow(BookExample book)
	{
		Loan loan = new Loan(this, book);
		final int size = loans.length;
		loans = Arrays.copyOf(loans, size + 1);
		loans[size] = loan;
	}
	
	public final void Reserve(Book book)
	{
		Reservation reservation = new Reservation(book, Calendar.getInstance(), this);
		final int size = reservations.length;
		reservations = Arrays.copyOf(reservations, size + 1);
		reservations[size] = reservation;
	}
	
	public final String getName()
	{
		return name;
	}
	
	public final void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	@Override
	public String toString()
	{
		return "Person cpr: " + cpr.toString() + " name: " + name + " adress: " + address + " balance: " + balance;
	}

}
