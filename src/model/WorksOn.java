package model;

import java.sql.Date;

public class WorksOn {
	
	
	private String empNo;
	private String fName;
	private String lName;
	private String address;
	private Date dob;
	private char sex;
	private String position;
	private Deparment deptNo;
	
	
	public WorksOn(String empNo, String fName, String lName, String address, Date dob, char sex, String position,
			Deparment deptNo) {
		this.empNo = empNo;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.dob = dob;
		this.sex = sex;
		this.position = position;
		this.deptNo = deptNo;
	}


	public String getEmpNo() {
		return empNo;
	}


	public void setEmpNo(String empNo) {
		this.empNo = empNo;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public Deparment getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(Deparment deptNo) {
		this.deptNo = deptNo;
	}
	
	
}
