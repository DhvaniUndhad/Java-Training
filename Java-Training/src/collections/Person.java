package collections;

import java.math.BigInteger;

public class Person {

	private String name, gender, contact , adress;
	private Integer age; 

	public Person(String name, Integer age, String gender, String contact, String adress) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.adress = adress;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return " name=" + name + ", gender=" + gender + ", contact=" + contact + ", adress=" + adress + ", age="
				+ age + "\n";
	}

}
