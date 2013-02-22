package arma.net.book;

/**
 * 
 * @author Arma
 *	Book topic
 */

public class Topic {

	public final int nr;
	public final String name;
	
	public Topic(int cnr, String cname)
	{
		nr = cnr;
		name = cname;
	}
	
	@Override
	public String toString()
	{
		return "info about topic"; //TODO:
	}
}
