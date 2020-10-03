package PracticePrograms;

public class CompanyDemo {

	public static void main(String[] args) {
		Company1 obj = new Details();
		double profit1 = obj.profit(90, 170);
		String compName = Company1.getName(profit1);
		//obj.getCompDetails(profit1, compName);
		Company1 c = (profit, name) -> {
			return null;
		};

	}
}

class Details implements Company1 {

	@Override
	public String getCompDetails(double profit, String name) {
		return null;
	}

}
