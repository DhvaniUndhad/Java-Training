package abstraction;

public class Professor extends Person{
	String profName;
	String subject;
	
	Professor(){
		profName = "Mr. shah";
		subject = "Physics";
		
		
	}
	
	
	Professor(String name, String subj){
		this.subject = subj;
		this.profName = name;
		
	}
	

	@Override
	public void cook() {
		System.out.println("Professor is cooking.");
		
	}

	@Override
	public void teach() {
		System.out.println(profName + " is teaching " + subject + " at " + university);
		
		
	}

	@Override
	public void ride() {
		System.out.println("Professor riding a car.");
		
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
