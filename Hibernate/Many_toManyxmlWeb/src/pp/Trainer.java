package pp;

import java.util.Set;

public class Trainer {
private int tid;
private String tname;
private String languages;
private Set<Student> students;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getLanguages() {
	return languages;
}
public void setLanguages(String languages) {
	this.languages = languages;
}
public Set<Student> getStudents() {
	return students;
}
public void setStudents(Set<Student> students) {
	this.students = students;
}

}
