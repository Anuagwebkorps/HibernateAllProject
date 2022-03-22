import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.RegTrainer;
import pp.TempTrainer;
import pp.Trainer;

public class Save {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer t=new Trainer();
		t.setTid(101);
		t.setTname("kapil");
		
		RegTrainer t1=new RegTrainer();
		t1.setTid(102);
		t1.setTname("unstoppable");
		t1.setSal(50000);
		t1.setTiming("11 to 7");
		
		TempTrainer t2=new TempTrainer();
		t2.setTid(103);
		t2.setTname("abhi");
		t2.setAmount(5000);
		t2.setBatches("4");
		session.persist(t);
		session.persist(t1);
		session.persist(t2);
		tx.commit();
		session.close();
		System.out.println("added");
	}

}
