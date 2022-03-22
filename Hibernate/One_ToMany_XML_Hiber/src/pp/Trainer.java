package pp;

import java.util.List;

public class Trainer {
private Integer tid;
private String tname;
private String languages;
private List<Student> students;
public Integer getTid() {
	return tid;
}
public void setTid(Integer tid) {
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
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}

}
