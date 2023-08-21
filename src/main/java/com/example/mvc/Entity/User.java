package com.example.mvc.Entity;

public class User {

	private String userName;

	private String fName;

	private String lName;

	private int age;

	private String gender;

	private String city;

	private String eMail;

	private String cNumber;

	private String uAdd;

	private String language;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String fName, String lName, int age, String gender, String city, String eMail,
			String cNumber, String uAdd, String language) {
		super();
		this.userName = userName;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.eMail = eMail;
		this.cNumber = cNumber;
		this.uAdd = uAdd;
		this.language = language;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getcNumber() {
		return cNumber;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}

	public String getuAdd() {
		return uAdd;
	}

	public void setuAdd(String uAdd) {
		this.uAdd = uAdd;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", gender="
				+ gender + ", city=" + city + ", eMail=" + eMail + ", cNumber=" + cNumber + ", uAdd=" + uAdd
				+ ", language=" + language + "]";
	}

}
