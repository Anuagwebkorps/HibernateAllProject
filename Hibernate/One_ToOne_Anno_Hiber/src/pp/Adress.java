package pp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="adrss")
public class Adress {
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
@PrimaryKeyJoinColumn
private int hno;
private String street;
private String city;
@OneToOne(targetEntity=Building.class,cascade=CascadeType.ALL)
private Building building;
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Building getBuilding() {
	return building;
}
public void setBuilding(Building building) {
	this.building = building;
}

}
/*
 *You can use the @JoinColumn annotation to map the foreign key column of a
 * managed association. The @PrimaryKeyJoinColumn specifies the mapping of 
 * the foreign key column of a secondary table or the foreign key column in 
 * an inheritance mapping that uses the JOINED strategy. */
