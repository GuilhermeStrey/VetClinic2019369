package adminstaff;

import staff.*;

public class IT extends AdminStaff {
	
	public IT(String name, int staffNumber, double salary) {
		super(name, staffNumber, salary);
		this.type = "IT";
	}

}
