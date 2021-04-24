package model;

import java.util.List;

public class Generate {

	public String generateDeparment(List<Deparment> inserts, int loops) {
		String insert = "";
		
		for (Deparment deparment : inserts) {
			
			insert += "INSERT INTO Deparment VALUES(" + deparment.getDeptName() +","+ deparment.getDeptNo()+","+deparment.getMgrEmpno()+"); \n";
			
		}
		
		return insert;
	}
	
	public String generateEmployee(Employee inserts, int loops) {
		String insert = "";
		
		for(int i=0; i < loops; i++) {
			
			insert += "INSERT INTO Employee VALUES(" + inserts.getEmpNo()+","+ inserts.getfName()+","+inserts.getlName()+","+
					inserts.getAddress()+","+ inserts.getDob()+","+inserts.getSex()+","+inserts.getPosition()+","+inserts.getDeptNo()+"); \n";
			
		}
		
		
		return insert;
	}
	
	public String generateProject(Project inserts, int loops) {
		String insert = "INSERT INTO Project VALUES(";
		
		for(int i=0; i < loops; i++) {
			
			insert += "INSERT INTO Employee VALUES(" + inserts.getProjNo()+","+ inserts.getProjName()+","+inserts.getDeptNo()+"); \n";
			
		}
		
		return insert;
	}
	
	public String generateWorksOn(WorksOn inserts, int loops) {
		String insert = "INSERT INTO WorksOn VALUES(";
		
		for(int i=0; i < loops; i++) {
			
			insert += "INSERT INTO Employee VALUES(" + inserts.getEmpNo()+","+ inserts.getProjNo()+","+inserts.getDateWorked()+","+inserts.getHoursWorked()+"); \n";
			
		}
		
		
		return insert;
	}


}
