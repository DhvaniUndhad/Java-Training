package PracticePrograms;

public interface Company1 {

	String getCompDetails(double profit, String name);

	default double profit(double cp, double sp) {
		return sp - cp;
	}

	static String getName(double value) {
		return "Global";

	}

}
