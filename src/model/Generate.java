package model;

import java.util.List;

public class Generate {

	public String generateDeparment(List<Deparment> inserts) {
		String insert = "";
		
		for (Deparment deparment : inserts) {
			
			insert += "INSERT INTO Deparment VALUES(" + deparment.getDeptName() +","+ deparment.getDeptNo()+","+deparment.getMgrEmpno()+"); \n";
			
		}
		
		return insert;
	}
	
	public String generateEmployee(List<Employee> inserts) {
		String insert = "";
		
		for (Employee employee : inserts) {
			
			insert += "INSERT INTO Employee VALUES(" + employee.getEmpNo()+","+ employee.getfName()+","+employee.getlName()+","+
					employee.getAddress()+","+ employee.getDob()+","+employee.getSex()+","+employee.getPosition()+","+employee.getDeptNo()+"); \n";
			
		}
		
		
		return insert;
	}
	
	public String generateProject(List<Project> inserts) {
		String insert = "INSERT INTO Project VALUES(";
		
		for (Project project : inserts) {
			
			insert += "INSERT INTO Employee VALUES(" + project.getProjNo()+","+ project.getProjName()+","+project.getDeptNo()+"); \n";
			
		}
		
		return insert;
	}
	
	public String generateWorksOn(List<WorksOn> inserts) {
		String insert = "INSERT INTO WorksOn VALUES(";
		
		for (WorksOn worksOn : inserts) {
			
			insert += "INSERT INTO Employee VALUES(" + worksOn.getEmpNo()+","+ worksOn.getProjNo()+","+worksOn.getDateWorked()+","+worksOn.getHoursWorked()+"); \n";
			
		}
		
		
		return insert;
	}


}
