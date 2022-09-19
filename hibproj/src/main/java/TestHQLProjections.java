import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.util.HibernateUtil;

public class TestHQLProjections {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<Object[]> query = session.createQuery("select p.name,p.price from Product p where p.id>: pid");
		query.setParameter("pid", 10);
		List<Object[]> projList = query.list();
		
		for (Object[] objects : projList) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println();
		}
		
		session.close();
		sessionFactory.close();
	}
	
	
	
}
