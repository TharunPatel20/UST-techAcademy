import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.EmployeeDetails;

public class Main {
	public static void main(String[] arg) {
	
//		XML based bean configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");
		
//		singleton scope
		EmployeeDetails emp1 = (EmployeeDetails) context.getBean("emp1", EmployeeDetails.class);
		System.out.println(emp1.hashCode() +" "+ emp1);
		EmployeeDetails emp01 = (EmployeeDetails) context.getBean("emp1", EmployeeDetails.class);
		System.out.println(emp01.hashCode()+" "+ emp01);
		
//		scope = prototype
		EmployeeDetails emp2 = (EmployeeDetails) context.getBean("emp2",EmployeeDetails.class);
		System.out.println(emp2.hashCode() +" " + emp2);
		EmployeeDetails emp3 = (EmployeeDetails) context.getBean("emp2",EmployeeDetails.class);
		System.out.println(emp3.hashCode() +" " + emp3);
	}
}

/*
 * output:
 * same object is called here
	"77269878" 		EmployeeDetails [employeeName=Tharun, employeeEmail=Tharun@mail.com, employeeAddress=hyd, employeePhone=9122334433]
	"77269878" 		EmployeeDetails [employeeName=Tharun, employeeEmail=Tharun@mail.com, employeeAddress=hyd, employeePhone=9122334433]
*	A new object is created everytime 
	"1540374340" 	EmployeeDetails [employeeName=raj, employeeEmail=raj@mail.com, employeeAddress=delhi, employeePhone=9988776433]
	"694316372" 	EmployeeDetails [employeeName=raj, employeeEmail=raj@mail.com, employeeAddress=delhi, employeePhone=9988776433]
 */
