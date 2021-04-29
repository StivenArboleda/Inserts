package model;

import java.util.List;

public class Generate {
	
	private String deptInsert;
	private String empInsert;
	private String projInsert;
	private String wOInsert;

	
	
	public Generate() {
		deptInsert = "";
		empInsert = "";
		projInsert = "";
		wOInsert = "";
	}

	public void generateDeparment(List<Deparment> inserts) {
		String insert = "";
		
		for (Deparment deparment : inserts) {
			
			insert += "INSERT INTO Deparment VALUES(" + deparment.getDeptName() +","+ deparment.getDeptNo()+","+deparment.getMgrEmpno()+"); \n";
			
		}
		
		deptInsert += insert;
	}
	
	public void generateEmployee(List<Employee> inserts) {
		String insert = "";
		
		for (Employee employee : inserts) {
			
			insert += "INSERT INTO Employee VALUES(" + employee.getEmpNo()+","+ employee.getfName()+","+employee.getlName()+","+
					employee.getAddress()+","+ employee.getDob()+","+employee.getSex()+","+employee.getPosition()+","+employee.getDeptNo()+"); \n";
			
		}
		
		
		empInsert += insert;
	}
	
	public void generateProject(List<Project> inserts) {
		String insert = "INSERT INTO Project VALUES(";
		
		for (Project project : inserts) {
			
			insert += "INSERT INTO Employee VALUES(" + project.getProjNo()+","+ project.getProjName()+","+project.getDeptNo()+"); \n";
			
		}
		
		projInsert += insert;
	}
	
	public void generateWorksOn(List<WorksOn> inserts) {
		String insert = "INSERT INTO WorksOn VALUES(";
		
		for (WorksOn worksOn : inserts) {
			
			insert += "INSERT INTO Employee VALUES(" + worksOn.getEmpNo()+","+ worksOn.getProjNo()+","+worksOn.getDateWorked()+","+worksOn.getHoursWorked()+"); \n";
			
		}
		
		
		wOInsert += insert;
	}

	public String getDeptInsert() {
		return deptInsert;
	}

	public String getEmpInsert() {
		return empInsert;
	}

	public String getProjInsert() {
		return projInsert;
	}

	public String getwOInsert() {
		return wOInsert;
	}
	
	public String[] genereFullName(int numbers) {
		
		String[] fullName = new String[numbers];
		
		String[] nombres = { "Andrea", "David", "Bartolome", "Alejandoro", "Striven", "Baltasar", "Sebastian", "Bartolo", "Bartolomé", "Lorena", 
				"Isabella", "Valentina", "Daniela", "Andrea", "Carlos", "Laura", "Carolina", "Camila", "Jesús", "Miguel"};
		
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Ordoñez", "Cardona", "Cardoso", "Polo", "Carillo", "Hurtado", "Castillo", 
				"Castaño", "Castro", "Garcia", "Arboleda", "Henao", "Cortes", "Mora", "Ortiz" };

		for (int i = 0; i < numbers; i++) {
			fullName[i] = 
					(char)34 + nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1  ) - 0 + 1) + 0))] + (char)34+ ", "
				+ (char)34 + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))]+ (char)34;
		}
		
		return fullName;
	}
	
	

}
