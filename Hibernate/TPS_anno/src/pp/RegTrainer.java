package pp;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="rtr1")
@PrimaryKeyJoinColumn(name="tid")
public class RegTrainer extends Trainer{
private int sal;
private String timing;
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getTiming() {
	return timing;
}
public void setTiming(String timing) {
	this.timing = timing;
}

}
