package arma.net.lectures;

import java.util.Date;

public class PlannedLecture {
	private final Lecture lecture;
	private String forum;
	private final Date newDate;
	private final double entryFee;
	
	public PlannedLecture(Lecture clecture, Date calendar, double centryFee)
	{
		lecture = clecture;
		newDate = calendar;
		entryFee = centryFee;
	}
	
	@Override
	public String toString()
	{
		return "Lecture: " + lecture.toString() + " lectures forum: " + forum + " lecture date: " + newDate.toString() + " entry fee: " + entryFee; //TODO:
	}
	
	public final void setForum(String frm)
	{
		forum = frm;
	}
}
