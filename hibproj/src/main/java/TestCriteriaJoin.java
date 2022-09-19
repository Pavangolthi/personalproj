import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;
import com.mtc.app.util.HibernateUtil;

public class TestCriteriaJoin {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		
		Root<Product> productRoot = criteriaQuery.from(Product.class);
		Root<Supplier> supplierRoot = criteriaQuery.from(Supplier.class);
		
		//criteriaQuery.multiselect(productRoot,supplierRoot).where(criteriaBuilder.equal(productRoot.get("supplier"), supplierRoot.get("id")));
		
		criteriaQuery.multiselect(productRoot,supplierRoot).where(criteriaBuilder.equal(productRoot.join("supplier", JoinType.LEFT), supplierRoot.get("id")));
		
		Query<Object[]> query = session.createQuery(criteriaQuery);
		
		List<Object[]> objectList = query.list();
		
		for (Object[] objects : objectList) {
			System.out.println(objects[0]);
			System.out.print(objects[1]);
			System.out.println("");
		}
		
		session.close();
		sessionFactory.close();
	}

}
