package pp;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
//Hibernate inhertance mapping using annotation
@Entity
@Table(name="trainer")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("trainer")
public class Trainer {
@Id //primary key 
private int tid;
private String tname;
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

}
