import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.repackage.cglib.asm.attrs.Annotation;

import pp.Student;
import pp.Trainer;
  
public class Save {
	    public static void main(String args[])
	    {
	Session session =new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	 Student s1=new Student();
	 s1.setSid(1);
	 s1.setSname("Abhi");
	 s1.setBranch("IT");
	 Student s2=new Student();
	 s2.setSid(2);
	 s2.setSname("Abhijit");
	 s2.setBranch("IT");
	
	 Student s3=new Student();
	 s3.setSid(3);
	 s3.setSname("Shiv");
	 s3.setBranch("IT");
	 
	 ArrayList<Student> st1=new ArrayList<Student>();
	 st1.add(s1);
	 st1.add(s3);
	 ArrayList<Student> st2=new ArrayList<Student>();
	 st2.add(s2);
	 
	 Trainer t1=new Trainer();
	 t1.setTid(101);
	 t1.setName("Dhoni");
     t1.setStudents(st1);
     Trainer t2=new Trainer();
	 t2.setTid(102);
	 t2.setName("Virat");
     t2.setStudents(st2);
     
     session.save(t1);
     session.save(t2);
     tx.commit();
     session.close();
     
	
	
	
	
	
	

}
}