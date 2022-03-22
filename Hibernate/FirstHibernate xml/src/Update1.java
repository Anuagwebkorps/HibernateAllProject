//Update with HQl it will return int 
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class Update1{

	public static void main(String[] args) {
		int u=1;
		while(u<3){
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("Update User Name:");
		String name =sc.next();
		System.out.println("Update User Job:");
		String job =sc.next();
		
		Query qr=session.createQuery("update Emp set name=?,job=? where id=?");
		qr.setParameter(0, name);
		qr.setParameter(1, job);
		qr.setParameter(2, id);
		//*******************Other Query******************
		/*Query qr=session.createQuery("select avg(id) from Emp");
		List<Integer> li=qr.list();  
		System.out.println(li.get(0));*/ 
       /*Query qr=session.createQuery("update Emp set name=:xx,job=:yy where id=:zz");
		qr.setParameter("xx", name);
		qr.setParameter("yy", job);
		qr.setParameter("zz", id);*/
		int i=qr.executeUpdate();
		tx.commit();
		session.close();
		System.out.println(i+" record Updated");
		u++;

	}
	}

}
