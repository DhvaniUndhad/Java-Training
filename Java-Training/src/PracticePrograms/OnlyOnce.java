package PracticePrograms;

public class OnlyOnce {
	
	private static OnlyOnce onlyOnce = new OnlyOnce();

	private OnlyOnce(){
		
	}
	
	public static OnlyOnce getInstance() {
		return onlyOnce;
	}
	
	public void showMessage() {
		System.out.println("Showing message");
	}
}


