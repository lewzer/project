package arma.net.person;

public class Employee {

	private final String stilling;	
	private final String thesis;
	
	public Employee(String cstilling, String cthesis)
	{
		stilling = cstilling;
		thesis = cthesis;
	}
	
	public final String getStilling()
	{
		return stilling;
	}
	
	@Override
	public String toString()
	{
		return "Employee stilling: " + stilling + " thesis: " + thesis;
	}
	
}
