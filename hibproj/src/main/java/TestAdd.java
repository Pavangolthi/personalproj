import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestAdd {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Product product = new Product(26, "Vivo V20", 300, 45, "Vivo");
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
			session.save(product);
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}

}
