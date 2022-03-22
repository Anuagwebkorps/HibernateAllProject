import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.RegTrainer;
import pp.TempTrainer;
import pp.Trainer;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Trainer");
		List<Trainer> al=qr.list();
		for(Trainer t:al)
		{
			System.out.println(t.getTid()+" "+t.getTname());
		}
		qr=session.createQuery("from RegTrainer");
		List<RegTrainer> al1=qr.list();
		for(RegTrainer t:al1)
		{
			System.out.println(t.getTid()+" "+t.getTname()+" "+t.getTiming()+" "+t.getSal());
		}
		qr=session.createQuery("from TempTrainer");
		List<TempTrainer> al2=qr.list();
		for(TempTrainer t:al2)
		{
			System.out.println(t.getTid()+" "+t.getTname()+" "+t.getBatches()+" "+t.getAmount());
		}
		session.close();
	}

}
