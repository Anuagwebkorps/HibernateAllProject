package pp;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ttr")
public class TempTrainer extends Trainer {
private int amount;
private String batches;
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getBatches() {
	return batches;
}
public void setBatches(String batches) {
	this.batches = batches;
}

}
