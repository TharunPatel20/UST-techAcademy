
//"Write a java program which accepts multiple employees details ,
//1)Create thread class
//2)make the use of runnable interface in it."


package assignments;

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
		Employee employee1 = new Employee(i);
		Thread thread = new Thread(employee1);
		thread.start();
		
		}
	}

}

class Employee implements Runnable{		
	private int details;
	
	Employee(int details){
		this.details = details;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("adding details of employee-"+details);
		try {
			System.out.println("adding takes time");
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("added details of employee-"+details);
	}
	
}