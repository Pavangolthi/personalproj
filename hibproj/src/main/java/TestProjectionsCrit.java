import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestProjectionsCrit {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		Root<Product> root = criteriaQuery.from(Product.class);
		criteriaQuery.multiselect(root.get("id"),root.get("name")).where(criteriaBuilder.gt(root.get("id"), 10));
		Query<Object[]> query = session.createQuery(criteriaQuery);
		List<Object[]> objects = query.list();
		
		for (Object[] objects2 : objects) {
			System.out.print("Id: "+objects2[0]+",");
			System.out.println(" Name: "+objects2[1]);
		}
		
		session.close();
		sessionFactory.close();
		
	}
}
