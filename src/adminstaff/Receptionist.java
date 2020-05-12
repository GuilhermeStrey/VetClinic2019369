package adminstaff;

import staff.*;

public class Receptionist extends AdminStaff {

	public Receptionist(String name, int staffNumber, String salary, String task) {
		super(name, staffNumber, salary, task);
		this.type = "Receptionist";
	}

}
