package adminstaff;

import staff.*;

public class Receptionist extends AdminStaff {

	public Receptionist(String name, int staffNumber, double salary) {
		super(name, staffNumber, salary);
		this.type = "Receptionist";
	}

}
