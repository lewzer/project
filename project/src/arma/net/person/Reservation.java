package arma.net.person;

import java.util.Calendar;

import arma.net.book.Book;

public class Reservation {
	private final Book book;
	private final Calendar date;
	private final Person person;
	
	public Reservation(Book cbook, Calendar cdate, Person cperson)
	{
		book = cbook;
		date = cdate;
		person = cperson;
	}
	
	public final Calendar getDate()
	{
		return date;
	}
	
	@Override
	public String toString()
	{
		return "info about the reservation"; //TODO
	}
}
