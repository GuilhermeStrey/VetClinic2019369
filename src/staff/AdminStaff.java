package staff;

public abstract class AdminStaff extends Staff {
	
	protected String task;
	
	public AdminStaff(String name, int staffNumber, String salary, String task) {
		super(name, staffNumber, salary);
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	public String toString(){  
		  return ("Staff Number: " + staffNumber + "\nName: " + name + "\nRole: " + type + "\nSalary: " + salary);  
	} 

}
