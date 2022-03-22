import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.repackage.cglib.asm.attrs.Annotation;

import pp.Student;
import pp.Trainer;

public class Show {
     public static void main(String args[])
     {
     Session session =new AnnotationConfiguration().configure().buildSessionFactory().openSession();
      Query q=session.createQuery("from Trainer"); //Trainer class hai
      List<Trainer>al=q.list();
      for(Trainer t:al)
      {
    	 System.out.println(t.getTid()+" "+t.getName()+" ");
    	 List<Student> all=t.getStudents();
         for(Student s:all) 
    	{
      	  System.out.println(s.getSid()+" "+s.getSname()); 

         }
    	 
      }
      session.close();
     }
}
