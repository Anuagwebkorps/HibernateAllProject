package pp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Rdao {
 Session session =new Configuration().configure().buildSessionFactory().openSession();
 public Integer addTrain(Trainer t)
 {
	 //Integer i=(Integer)session.save(t);
	 session.saveOrUpdate(t);
	 session.beginTransaction().commit();
	 session.close();
	 return 101;
	 
 }
 public void delTrain(Trainer t)
 {
	 session.delete(t);
	 session.beginTransaction().commit();
	 session.close();
 }
 public void delStu(Student s)
 {
	 session.delete(s);
	 session.beginTransaction().commit();
	 session.close();
 }
 public List<Trainer> show()
 { 
		Query qr=session.createQuery("from Trainer");
		return qr.list();
 }
 
}
