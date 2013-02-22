package arma.net.book;

/**
 * 
 * @author Arma
 * Info about the author of books
 */

public class Author {

	private final String name;
	private final int born;
	private final int deceased;
	private final String bornWhere;
	
	public Author(String cname, int cborn, int cdeceased, String cbornWhere)
	{
		name = cname;
		born = cborn;
		deceased = cdeceased;
		bornWhere = cbornWhere;
	}
	
	public final String getAuthor()
	{
		return "Author: " + name + ", born: " + born + ", in: " + bornWhere + ", deceased: " + deceased;
	}
	
	@Override
	public String toString()
	{
		return "info about author"; // TODO:
	}
	
}
