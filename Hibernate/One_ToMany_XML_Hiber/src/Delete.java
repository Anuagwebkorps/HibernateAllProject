import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer;

public class Delete {
    public static void main(String args[])
    {
    	Session session =new Configuration().configure().buildSessionFactory().openSession();
    	Transaction tx=session.beginTransaction();
    	Trainer t=new Trainer();
    	t.setTid(1);
    	session.delete(t);
    	tx.commit();
    	session.close();
    	System.out.println("deleted");
    }
} 
