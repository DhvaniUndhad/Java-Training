package abstraction;

public class Student extends Person{
	
	String subject;
	
	Student(){
		this.subject="Mathemetics";
	}

	@Override
	public void cook() {
		System.out.println("Student is cooking.");
	}

	@Override
	public void teach() {
		
	}

	@Override
	public void ride() {
		System.out.println("Student riding a bycycle.");
		
	}
	
	public String study() {
		
		return ("Student is studying " + subject + " at " + university );
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
