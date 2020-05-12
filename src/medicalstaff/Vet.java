package medicalstaff;

import staff.*;

public class Vet extends MedicalStaff {

	public Vet(String name, int staffNumber, String salary) {
		super(name, staffNumber, salary);
		this.type = "Vet";
	}

}
