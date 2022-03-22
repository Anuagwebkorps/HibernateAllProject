//Delete with HQl it will return int 
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class Delete1{

	public static void main(String[] args) {
		int u=1;
		while(u<3){
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		Query qr=session.createQuery("delete from Emp where id=?");
		qr.setParameter(0, id);
		//****Question Mark{?} ki jagh eid replace ho gaya ****
		//Query qr=session.createQuery("delete from Emp where id=:eid");
		//qr.setParameter("eid", id);
		int i=qr.executeUpdate();
		tx.commit();
		session.close();
		System.out.println(i+" record deleted");
		u++;

	}
	}

}
