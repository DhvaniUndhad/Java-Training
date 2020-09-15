package day4;
//Abstract Example
public abstract class Person {
	
	private String name;
	private String gender;
	
	public Person(String n, String g) {
		this.name=n;
		this.gender=g;
	}
	
	//Abstract method
	
	public abstract void work();
		
	

	@Override
	public String toString() {
		return  "Name=" + this.name + ", Gender= " + this.gender;
	}
	
	//Concrete method
	
	public void changeName(String newName) {
		this.name =newName;
	}

}
