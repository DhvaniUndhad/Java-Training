package collections;

import java.util.List;

public class Employee {
	private String name, gender;
	private Integer age;
	private List<Address> adressList;

	public Employee(String name, Integer age, String gender, List<Address> adressList) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adressList = adressList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Address> getAdress() {
		return adressList;
	}

	public void setAdress(List<Address> adressList) {
		this.adressList = adressList;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", age=" + age + ", adressList=" + adressList;
	}

}
