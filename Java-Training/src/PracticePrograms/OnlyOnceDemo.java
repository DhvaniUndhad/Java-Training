package PracticePrograms;

public class OnlyOnceDemo {

	public static void main(String[] args) {
		/*
		 * below line gives you an error, because constructor is private.
		 */
		//OnlyOnce onlyOnce = new OnlyOnce();
		
		OnlyOnce onlyonce = OnlyOnce.getInstance();
		onlyonce.showMessage();
				
	}

}
