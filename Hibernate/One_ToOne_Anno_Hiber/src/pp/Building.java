package pp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="builld")
public class Building {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bno;
private String bname;
@OneToOne(targetEntity=Adress.class,cascade=CascadeType.ALL)
private Adress address;
public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public Adress getAddress() {
	return address;
}
public void setAddress(Adress address) {
	this.address = address;
}

}
