package bean;

public class EmployeeDetails {
	private String employeeName;
	private String employeeEmail;
	private String employeeAddress;
	private String employeePhone;
	
	public EmployeeDetails() {}
		
	public EmployeeDetails(String employeeName, String employeeEmail, String employeeAddress, String employeePhone) {
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
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
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
