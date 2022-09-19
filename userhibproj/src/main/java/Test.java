import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import com.user.app.entity.User;
import com.user.app.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//fetching the entire list from the table
//		List<User> user = (List<User>)session.createQuery("from User").list();
//		System.out.println(user);
		
		//Adding a new record to the table
//		User user = new User(6,"EeshaReddy","eesha");
//		Transaction transaction = session.getTransaction();
//		transaction.begin();
//			session.save(user);
//		transaction.commit();
		
		Criteria criteria =  session.createCriteria(User.class).setProjection(Projections.max("id"));
		Integer id  = (Integer) criteria.uniqueResult();
		System.out.println(id);
		session.close();
		sessionFactory.close();
	}
}
