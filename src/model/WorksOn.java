package model;

import java.sql.Date;

public class WorksOn {
	
	
	private String empNo;
	private String projNo;
	private String dateWorked;
	private String hoursWorked;
	
	
	public WorksOn(String empNo, String projNo, String dateWorked, String hoursWorked) {

		this.empNo = empNo;
		this.projNo = projNo;
		this.dateWorked = dateWorked;
		this.hoursWorked = hoursWorked;
	}


	public String getEmpNo() {
		return empNo;
	}


	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}


	public String getProjNo() {
		return projNo;
	}


	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}


	public String getDateWorked() {
		return dateWorked;
	}


	public void setDateWorked(String dateWorked) {
		this.dateWorked = dateWorked;
	}


	public String getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(String hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	

}