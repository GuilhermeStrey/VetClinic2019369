package staff;

public class StaffNumber {
	
	public int staffN;

	public StaffNumber() {
		staffN = 0;	//start at number 0
	}
	
	public int getStaffNumber() {
		
		this.staffN++;
		return this.staffN;
	}
	
}


