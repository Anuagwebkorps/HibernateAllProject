package pp;

import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	private String branch;
	private Set<Trainer> trainers;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Set<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(Set<Trainer> trainers) {
		this.trainers = trainers;
	}
	
}
