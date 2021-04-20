package manytomany;

import java.util.Date;
import java.util.Set;

public class Training {
	private int tid;
	private String tname;
	private Date startDate;
	private Set<Student> students;
	public final int getTid() {
		return tid;
	}
	public final void setTid(int tid) {
		this.tid = tid;
	}
	public final String getTname() {
		return tname;
	}
	public final void setTname(String tname) {
		this.tname = tname;
	}
	public final Date getStartDate() {
		return startDate;
	}
	public final void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public final Set<Student> getStudents() {
		return students;
	}
	public final void setStudents(Set<Student> students) {
		this.students = students;
	}
}
