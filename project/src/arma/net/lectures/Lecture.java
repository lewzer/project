package arma.net.lectures;

import arma.net.person.Employee;

public class Lecture {

	private final String title;
	private final Employee employee;
	private String description;
	private final int duration;
	
	public Lecture(String ctitle, Employee cemployee, int cduration)
	{
		title = ctitle;
		employee = cemployee;
		duration = cduration;
	}
	
	public final String getTitle()
	{
		return title;
	}
	
	public final void setDesc(String desc)
	{
		description = desc;
	}
	
}
