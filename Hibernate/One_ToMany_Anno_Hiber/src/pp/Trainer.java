package pp;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="tt")
public class Trainer {
	@Id //pk
  private int tid;
  private String name; //FetchType.LAZY – Fetch it when you need it
  @OneToMany(fetch=FetchType.LAZY,targetEntity=Student.class,cascade=CascadeType.ALL)
  @JoinColumn(name="tidd",referencedColumnName="tid") //foreginkey
  private List<Student> students;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
  
}
