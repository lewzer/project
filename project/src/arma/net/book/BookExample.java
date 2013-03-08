package arma.net.book;

public class BookExample extends Book
{
	private final int exampleNr;

	public BookExample(int cexampleNr, String ctitle, Topic ctopic, int cyear)
	{
		super(ctitle, ctopic, cyear);
		exampleNr = cexampleNr;
	}
	
	public final int getExample()
	{
		return exampleNr;
	}
	
	@Override
	public String toString()
	{
		String bookInfo = super.toString();
		return "Book example nr: " + exampleNr + " book info: " + bookInfo;
	}

}
