import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Address;
import pp.Building;

public class Save {

	public static void main(String[] args) {
        Session sesssion =new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx=sesssion.beginTransaction();
       
        Building b1=new Building();
        b1.setBname("tulsi tower");
        Address a1=new Address();
        a1.setCity("khargone");
        a1.setStreet("drp");
        a1.setBuilding(b1);
        
        Building b2=new Building();
        b2.setBname("Vijay town");
        Address a2=new Address();
        a2.setCity("indore");
        a2.setStreet("vijay nagar");
        a2.setBuilding(b2);
       
        b1.setAddress(a1);
        b2.setAddress(a2);
        int i=(int) sesssion.save(a1);
        int j=(int) sesssion.save(a2);
        tx.commit();
        sesssion.close();
        System.out.println(i+" "+j+"added");
        

        
	}

}
