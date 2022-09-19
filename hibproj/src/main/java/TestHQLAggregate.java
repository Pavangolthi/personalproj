import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.util.HibernateUtil;

public class TestHQLAggregate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query<Float> query = session.createQuery("select max(p.price) from Product p");
		Float maxPrice = query.uniqueResult();
		System.out.println(maxPrice);
		session.close();
		sessionFactory.close();
	}

}
