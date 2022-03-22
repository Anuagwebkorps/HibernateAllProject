package pp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class Show {
	public static void main(String args[])
	{
 Session session =new AnnotationConfiguration().configure().buildSessionFactory().openSession();
 List<Adress> al=session.createQuery("from Adress").list();
 for(Adress a:al)
 {
	 System.out.println(a.getHno()+" "+a.getCity()+a.getStreet());
	 Building b=a.getBuilding();
	 System.out.println("Building no:"+b.getBno()+"  "+"Building name:"+b.getBname());
 }
}
}

