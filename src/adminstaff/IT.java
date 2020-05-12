package adminstaff;

import staff.*;

public class IT extends AdminStaff {
	
	public IT(String name, int staffNumber, String salary, String task) {
		super(name, staffNumber, salary, task);
		this.type = "IT";
	}

}
