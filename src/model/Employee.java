package model;

public class Employee {
	
	private String empNo;
	private String fName;
	private String lName;
	private String address;
	private String dob;
	private char sex;
	private String position;
	private int deptNo;
	
	public Employee(String empNo, String fName, String lName, String address, String dob, char sex, String position, int deptNo) {
		
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
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

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
	
	
}
