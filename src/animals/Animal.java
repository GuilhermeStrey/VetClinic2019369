package animals;

public abstract class Animal {
	
	public String name;
	public int age;
	public String medicalCondition;
	public String specie;
	
	public Animal (String name, int age, String medicalCondition) {
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
		this.specie = specie;
	}

	public String getName() {
		return name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	
	public String toString(){  
		  return ("Type of Animal: " + specie + "\nName of Animal: " + name + "\nAge: " + age + "\nMedical Condition: " + medicalCondition);  
	}  
	
}

