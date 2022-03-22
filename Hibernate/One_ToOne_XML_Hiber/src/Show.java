import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Address;
import pp.Building;

public class Show {

	public static void main(String gg[])
	{
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		List<Address> al=session.createQuery("from Address").list();
		for(Address a:al)
		{
			System.out.println(a.getHno()+" "+a.getCity()+" "+a.getStreet());
			Building b=a.getBuilding();
			System.out.println(b.getBno()+" "+b.getBname());
		}
		session.close();
	}

}
