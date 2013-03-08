package arma.net.book;

import java.util.Arrays;

import arma.net.util.Utils;

/**
 * 
 * @author Arma
 *	Main class of book containing all properties of it
 */

public class Book
{
	private final String title;
	private Author[] authors = new Author[0];
	private final Topic topic;
	private final int year;

	public Book(String ctitle, Topic ctopic, int cyear)
	{
		title = ctitle;
		topic = ctopic;
		year = cyear;
	}

	public final void addAuthor(Author author)
	{
		final int size = authors.length;
		authors = Arrays.copyOf(authors, size + 1);
		authors[size] = author;
	}
	
	public final String getAuthors()
	{
		StringBuilder string = new StringBuilder();
		for(int i = 0; i < authors.length; i++)
		{
			string.append(authors[i].getAuthor());
			string.append("\n");
		}
		return string.toString();
	}
	
	public final String getTitle()
	{
		return title;
	}
	
	public final int getYear()
	{
		return year;
	}
	
	public final Topic getTopic()
	{
		return topic;
	}
	
	@Override
	public String toString()
	{
		String authorsStr = Utils.compileString(authors);
		return "Book title: " + title + " book topic: " + topic.toString() + " written in: " + year + " by: " + authorsStr;
	}
}
