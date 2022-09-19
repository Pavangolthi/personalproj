import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Query<Product> query = session.createQuery("select p from Product p where p.id>10 and p.name LIKE 'B%'");
		
		//Positional bind parameters
		//Query<Product> query = session.createQuery("select p from Product p where p.id > ?0 and p.name like ?1");
//		query.setParameter(0, 10);
//		query.setParameter(1, "D%");
		
		//Named bind Parameters
		Query<Product> query = session.createQuery("select p from Product p where p.id >: pid and p.name like :pname");
		query.setParameter("pid", 12);
		query.setParameter("pname", "S%");
	
		List<Product> prodList = query.list();
		
		for (Product product : prodList) {
			System.out.println(product);
		}
		session.close();
		sessionFactory.close();
	}

}
