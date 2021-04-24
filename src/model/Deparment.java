package model;

public class Deparment {
	
	private String deptNo;
	private String deptName;
	private String mgrEmpno;
	
	
	public Deparment(String deptNo, String deptName, String mgrEmpno) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.mgrEmpno = mgrEmpno;
	}


	public String getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getMgrEmpno() {
		return mgrEmpno;
	}


	public void setMgrEmpno(String mgrEmpno) {
		this.mgrEmpno = mgrEmpno;
	}
	
	
	
}
