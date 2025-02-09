package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDetails {
	
	@Value("e-name")
	private String employeeName;
	@Value("e-email")
	private String employeeEmail;
	@Value("e-number")
	private String employeePhone;
	
	
	@Autowired
	private  Address employeeAddress;
	
	
	public EmployeeDetails() {}
		
	public EmployeeDetails(String employeeName, String employeeEmail, Address employeeAddress, String employeePhone) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Address getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeName=" + employeeName + ", employeeEmail=" + employeeEmail
				+ ", employeeAddress=" + employeeAddress + ", employeePhone=" + employeePhone + "]";
	}
}
