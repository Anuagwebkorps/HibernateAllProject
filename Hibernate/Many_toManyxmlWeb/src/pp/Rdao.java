package pp;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.management.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Rdao {
Session session=new Configuration().configure().buildSessionFactory().openSession();
public int addTrainer(Trainer t)
{
	int i=(int) session.save(t);
	session.beginTransaction().commit();
	return i;
}
public int addStudent(Student s)
{
	int i=(int) session.save(s);
	//session.saveOrUpdate(s);
	session.beginTransaction().commit();
	return i;
}
public List<Trainer> ShowTrainer()
{
	return session.createQuery("from Trainer").list();
}
public void delTrainer(Trainer t)
{
	session.delete(t);
	session.beginTransaction().commit();
}
public void delStudent(Student s)
{
	session.delete(s);
	session.beginTransaction().commit();
}

public void UpdateT(Trainer t)
{
   session.saveOrUpdate(t);
   session.beginTransaction().commit();
	
}
public void UpdateStudent(Student s)
{
	session.saveOrUpdate(s);
	session.beginTransaction().commit();
}
public List<Student> ShowStudent()
{
	return session.createQuery("from Student").list();
}
public void updateData(int tid,String sids[])
       /*Hibernate Session provide different methods to fetch data from 
        * database. Two of them are – get() and load(). get() returns the 
        * object by fetching it from database */
{     //tid humko pata hai ho hi hogi
	//We should use get() when we want to make sure data exists in the database.
	Trainer t=(Trainer) session.get(Trainer.class,new Integer(tid));
	Set<Student> st=new LinkedHashSet<Student>();
	for(String id:sids)
	{
		int sid=Integer.parseInt(id);
		Student s=(Student) session.get(Student.class, new Integer(sid));
		st.add(s);
	}
	t.setStudents(st);
	session.saveOrUpdate(t);
	session.beginTransaction().commit();
}
public Trainer findTrainer(int tid) 
{
	return(Trainer)session.get(Trainer.class,new Integer(tid));
}
public Student findStudent(int sid) 
{
	return(Student)session.get(Student.class,new Integer(sid));
}
/*
 updateData(int tid,String sids[]) working:-
 1) phale jese hi updateData call huii Relation me hume
 2) tid ek mili or sids no of student kitne bhi ho skte hai suppose 3
 3)	Trainer t=(Trainer) session.get(Trainer.class,new Integer(tid));
 4) get method se sare trainer ke obj mil gaye tname,language.
 5) student set me mile ge.
 6) sids hai wo integer hogi 1,2,3, usko string me ker lo(parseInt).
 7)	Student s=(Student) session.get(Student.class, new Integer(sid));
 8) sid se sare student ke obj mile ge snmae,branch.
 9) usko ek vriable me store kera liya (s) then s ko add kera st me.
 10) sare student st me aa gaye then usko Trainer ki method setStudents(st); 
 11) me save kera liya.
 
 
 */



}