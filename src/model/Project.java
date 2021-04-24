package model;

public class Project {
	
	private String projNo;
	private String projName;
	private Deparment deptNo;
	
	public Project(String projNo, String projName, Deparment deptNo) {
		this.projNo = projNo;
		this.projName = projName;
		this.deptNo = deptNo;
	}

	public String getProjNo() {
		return projNo;
	}

	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public Deparment getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Deparment deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
}
