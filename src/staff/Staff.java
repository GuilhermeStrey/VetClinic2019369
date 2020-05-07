package staff;

public abstract class Staff {
	
	String name;
	int staffNumber;
	double salary;
	protected String type;
		
	public Staff(String name, int staffNumber, double salary) {
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.type = type;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString(){  
		  return name + " " + staffNumber + " " + salary + " " + type;  
	}  
}
