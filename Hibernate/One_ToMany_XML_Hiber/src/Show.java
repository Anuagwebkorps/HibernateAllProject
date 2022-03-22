
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Show {
	   public static void main(String args[])
	   {
       Session session =new Configuration().configure().buildSessionFactory().openSession();
       Query q=session.createQuery("from Trainer");
      List<Trainer>al=q.list(); //q me sabh show se store hoga or al me ek ker ke ata rahe gaa
      for(Trainer tt:al)
      {
    	  System.out.println(tt.getTid()+"  "+tt.getTname()+"  "+tt.getLanguages()); 
     
     List<Student>all=tt.getStudents(); //q me sabh show se store hoga or al me ek ker ke ata rahe gaa
     for(Student s:all)
      {
    	  System.out.println(s.getSid()+" "+s.getSname()+" "+s.getBranch()); 
      }
      }
      session.close();
      
	   }
}      