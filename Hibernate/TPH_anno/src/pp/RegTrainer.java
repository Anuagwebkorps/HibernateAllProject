package pp;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regtrainer")
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
