package staff;

public abstract class Staff {
	
	String name;
	int staffNumber;
	String salary;
	protected String type;
		
	public Staff(String name, int staffNumber, String salary) {
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String toString(){  
		  return ("Staff Number: " + staffNumber + "\nName: " + name + "\nRole: " + type + "\nSalary: " + salary);  
	}  
}
