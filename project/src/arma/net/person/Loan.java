package arma.net.person;

import java.util.Calendar;

import arma.net.book.BookExample;

/*
 * money stuff goes here
 */
public class Loan {
	private final Person loaner;
	private final BookExample bookExample;
	private final Calendar dateOut;
	private Calendar dateHome;
	
	private double fine;
	
	public Loan(Person cloaner, BookExample cbookExample)
	{
		loaner = cloaner;
		bookExample = cbookExample;
		dateOut = Calendar.getInstance();
	}
	
	public final Person getLoaner()
	{
		return loaner;
	}
	
	public final Calendar returnDate()
	{
		return dateHome;
	}
	
	public final void returned()
	{
		dateHome = Calendar.getInstance();
		dateHome.setTimeInMillis(System.currentTimeMillis());
	}
	
	public final void returned(int yr, int month, int day)
	{	
		dateHome = Calendar.getInstance();
		dateHome.set(yr,  month, day);
	}
	
	@Override
	public String toString()
	{
		return "Loaner: " + loaner.toString() + " bookexample: " + bookExample.toString() + "date loaned: " + dateOut.toString() + " returned " + ((dateHome != null) ? "yes" : "no"); //TODO:
	}
	
	public int passedDays()
	{
		long miliseconds = dateOut.getTimeInMillis() - dateHome.getTimeInMillis();
		return (int) (miliseconds / 1000 / 60 / 60 / 24);
	}
	
	public double calculateFee()
	{
		return fine * passedDays();
	}
}
