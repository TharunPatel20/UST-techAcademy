import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Address;
import bean.EmployeeDetails;

public class Main {
	public static void main(String[] arg) {
		// XML file is required here
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//no need for XML files
		ApplicationContext context = new AnnotationConfigApplicationContext("bean");
		EmployeeDetails employee= context.getBean("employeeDetails", EmployeeDetails.class);
		System.out.println(employee);
		
		Address address = context.getBean(Address.class);
		System.out.println(address);
	}
}
