
public class VetClinic2019369 {

	public VetClinic2019369() {
	}

	public static void main(String[] args) {
		
		// Create new Animals and Staff
		new creatorhelper.CreatorHelper().generate();

		// Initiate CLI
		new CLI().cli();;
	}
}


