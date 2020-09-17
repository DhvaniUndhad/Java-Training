package encapsulation;

public class Mobile {
	
	private double height = 5.44;
	private double width = 2.64;
	private int screenSize;
	private String type;
	private int maxVolume =10;
	private boolean power;
	
	
	//Constructor
	Mobile(){
		this.height =height;
		this.width= width;
	}
	
	public double getScreenSize() {
		return screenSize;
	}
	
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String mobileType(int screenSize) {
		
		switch(screenSize) {
		case 1:
			return "iPhone 6s";
		case 2:
			return "Samsung Galexy";
		case 3:
			return "Google pixel3Xl";
		}
		
		return "No value selected";
	}
	
	


	public int decreaseVolume() {
		if(0<maxVolume) {
			maxVolume++;
		}
		return maxVolume;
		
	}
	
	
	

}
