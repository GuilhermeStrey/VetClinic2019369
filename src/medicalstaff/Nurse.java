package medicalstaff;

import staff.*;

public class Nurse extends MedicalStaff {

	public Nurse(String name, int staffNumber, double salary) {
		super(name, staffNumber, salary);
		this.type = "Nurse";
	}

}
