package manytomany;

import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	private int marks;
	private Set<Training> trainings;
	public final int getSid() {
		return sid;
	}
	public final void setSid(int sid) {
		this.sid = sid;
	}
	public final String getSname() {
		return sname;
	}
	public final void setSname(String sname) {
		this.sname = sname;
	}
	public final int getMarks() {
		return marks;
	}
	public final void setMarks(int marks) {
		this.marks = marks;
	}
	public final Set<Training> getTrainings() {
		return trainings;
	}
	public final void setTrainings(Set<Training> trainings) {
		this.trainings = trainings;
	}
}
