import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class Update {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User id:");
		int id =sc.nextInt();
		System.out.println("Update User Name:");
		String name =sc.next();
		System.out.println("Update User Job:");
		String job =sc.next();
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction ex=session.beginTransaction(); //Transaction use kerte werna roll back hojata
		Emp e=new Emp();
		e.setId(id);
		e.setName(name);
		e.setJob(job);                     
		session.update(e);//void
		ex.commit();
		session.close();
		System.out.println("Update");
	}

}











































































































































































































































































































































































































































