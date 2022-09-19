import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestCriteria {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
		Root<Product> root = criteriaQuery.from(Product.class);//from clause
		//criteriaQuery.select(root);//select clause
		//criteriaQuery.select(root).where(criteriaBuilder.like(root.get("name"), "S%"));	
		//criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("id"), 10));
		criteriaQuery.select(root).where(criteriaBuilder.and(criteriaBuilder.gt(root.get("id"), 10),criteriaBuilder.like(root.get("name"), "D%")));
		
		
		Query<Product> query = session.createQuery(criteriaQuery);
		List<Product> prodList = query.list();
		
		for (Product product : prodList) {
			System.out.println(product);
		}
		
		session.close();
		sessionFactory.close();
		
		
	}
}
