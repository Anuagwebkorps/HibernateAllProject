import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Save {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("kalu");
		s1.setBranch("cs");
		s1.setYear(1);
		Student s2=new Student();
		s2.setSid(102);
		s2.setSname("ajay");
		s2.setBranch("cs");
		s2.setYear(2);
		Student s3=new Student();
		s3.setSid(103);
		s3.setSname("jaya");
		s3.setBranch("cs");
		s3.setYear(3);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Trainer t=new Trainer();
		t.setTid(1);
		t.setTname("abhijeet");
		t.setLanguages("java python react");
		t.setStudents(al);
	   // int i=(int) session.save(t);
		session.saveOrUpdate(t); //is method se save update dono ho jaye ga go jaye gaa
		System.out.println(" trainer added");
		tx.commit();
		session.close();
	}

}
