package SportApplication;

import java.util.List;

public class Sport {
	private String name;
	private List<String> time;

	public Sport(String name, List<String> time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTime() {
		return time;
	}

	public void setTime(List<String> time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Sport [name=" + name + ", time=" + time + "]";
	}
}

