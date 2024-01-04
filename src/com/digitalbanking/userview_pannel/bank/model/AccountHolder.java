package com.digitalbanking.userview_pannel.bank.model;

import com.digitalbanking.userview_pannel.Account;

public class AccountHolder {

private	String name;
private	int age;
private	String gender;
private	String email;
private	String dob;
private	String mobileNo;
private	String country;
private	String state;
private	String adharNo;
private	String panNo;
private String accountNumber;
private long amount;
private Account account;
private Account balence;
private String password;
private String repassword;
public AccountHolder(String name, int age, String gender, String email, String dob, String mobileNo, String country,
		String state, String adharNo, String panNo,String accountNumber,long amount) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.email = email;
	this.dob = dob;
	this.mobileNo = mobileNo;
	this.country = country;
	this.state = state;
	this.adharNo = adharNo;
	this.panNo = panNo;
	
	
}




public AccountHolder(String email, String password) {
    this.email = email;
    this.password = password;
}
public AccountHolder(String name,String email, String password,String repassword) {
	this.name=name;
    this.email = email;
    this.password = password;
    this.repassword=repassword;
}

public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public long getAmount() {
	return amount;
}

public String getPassword() {
    return password;
}
public void setAmount(long amount) {
	this.amount = amount;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getAdharNo() {
	return adharNo;
}
public void setAdharNo(String adharNo) {
	this.adharNo = adharNo;
}
public String getPanNo() {
	return panNo;
}
public void setPanNo(String panNo) {
	this.panNo = panNo;
}
@Override
public String toString() {
	return "AccountHolder [name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", dob=" + dob
			+ ", mobileNo=" + mobileNo + ", country=" + country + ", state=" + state + ", adharNo=" + adharNo
			+ ", panNo=" + panNo + "]";
}

}
