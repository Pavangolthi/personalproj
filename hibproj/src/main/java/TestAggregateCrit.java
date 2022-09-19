import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestAggregateCrit {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Float> criteriaQuery = criteriaBuilder.createQuery(Float.class);
		
		Root<Product> root = criteriaQuery.from(Product.class);
		
		criteriaQuery.select(criteriaBuilder.max(root.get("price")));
		
		Query<Float> query = session.createQuery(criteriaQuery);
		
		Float price = query.getSingleResult();
		
		System.out.println(price);
		
		session.close();
		sessionFactory.close();
	}

}
