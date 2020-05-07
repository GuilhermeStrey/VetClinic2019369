package medicalstaff;

import staff.*;

public class Trainee extends MedicalStaff {

	public Trainee(String name, int staffNumber, double salary) {
		super(name, staffNumber, salary);
		this.type = "Trainee";
	}

}
