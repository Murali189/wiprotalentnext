
public class Patie {

	public static void main(String[] args) {
		Patient patient = new Patient("Murali Krishna", 180/2.54, 75*2.2);
		
		System.out.println(patient.BMI());

	}
}
class Patient {
	String name;
	double height;
	double weight;
	
	public Patient(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI () {
		return ( weight / ( height * height ) ) * 70;
	}
}
