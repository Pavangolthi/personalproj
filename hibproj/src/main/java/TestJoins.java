import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.util.HibernateUtil;

public class TestJoins {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query<Object []> query = session.createQuery("select p,s from Product p right outer join p.supplier s");
		List<Object[]> objects = query.list();
		
		for (Object[] objects2 : objects) {
			System.out.println(objects2[0]);
			System.out.println(objects2[1]);
		}
		
		session.close();
		sessionFactory.close();
	}

}
