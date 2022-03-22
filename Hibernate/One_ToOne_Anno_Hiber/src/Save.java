import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import pp.Adress;
import pp.Building;

public class Save {
	public static void main(String args[])
	{
Session session =new AnnotationConfiguration().configure().buildSessionFactory().openSession();
Transaction tx=session.beginTransaction();
Building b1=new Building();
b1.setBname("First");
Adress a1=new Adress();
a1.setStreet("MJ Road");
a1.setCity("Indore");
a1.setBuilding(b1);

Building b2=new Building();
b2.setBname("Second");


Adress a2=new Adress();
a2.setStreet("Sanawad Road");
a2.setCity("khargone");
a2.setBuilding(b2);

b1.setAddress(a1);
b2.setAddress(a2);
int i=(int)session.save(b1);
int j=(int)session.save(b2);
tx.commit();
session.close();
System.out.println(i+" "+j+"added");


}
}
