import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cust.app.config.AppConfig;
import com.cust.app.dao.CustomerDAO;
import com.cust.app.model.Customer;

public class Test {
 public static void main(String[] args) {
	 
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	CustomerDAO customerDAO = applicationContext.getBean(CustomerDAO.class);
	System.out.println(customerDAO.getById(4));
	//System.out.println(customerDAO.addUser(new Customer(5, "Purvi", "PurviReddy")));
	//System.out.println(customerDAO.allUsers());
 }
}
