package pp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ss")
public class Student {
@Id	
private int sid;
private String sname;
private String branch;
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


}
