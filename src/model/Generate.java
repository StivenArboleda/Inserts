package model;

import java.util.List;
import java.util.Random;

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
	
	
	//====================================NEW======================================================================
	
	public String[] genereInsertEmployee(int numbers) {
		
		String[] insert = new String[numbers];
		
		String[] name = { "Andrea", "David", "Bartolome", "Alejandoro", "Striven", "Baltasar", "Sebastian", "Bartolo", "Bartolomé", "Lorena", 
				"Isabella", "Valentina", "Daniela", "Andrea", "Carlos", "Laura", "Carolina", "Camila", "Jesús", "Miguel"};
		
		String[] lastname = { "Gomez", "Guerrero", "Cardenas", "Ordoñez", "Cardona", "Cardoso", "Polo", "Carillo", "Hurtado", "Castillo", 
				"Castaño", "Castro", "Garcia", "Arboleda", "Henao", "Cortes", "Mora", "Ortiz" };
		
		String[] position = {"Maquinario", "De planta", "Operario", "Supervisor"};

		for (int i = 0; i < numbers; i++) {
			insert[i] = "INSERT TO employee VALUES("
				+ (char)34 + "E"+ i + (char)34+", " 
				+ (char)34 + name[(int) (Math.floor(Math.random() * ((name.length - 1  ) - 0 + 1) + 0))] + (char)34+ ", "
				+ (char)34 + lastname[(int) (Math.floor(Math.random() * ((lastname.length - 1) - 0 + 1) + 0))]+ (char)34+ ", "
				+ (char)34 + generateAddres() + (char)34+ ", "
				+ (char)34 + generateDOB()+(char)34+ ", "
				+ genereteSex() +", "
				+ (char)34 + position[(int) (Math.floor(Math.random() * ((position.length - 1) - 0 + 1) + 0))]+ (char)34+ ");";
		}
		
		return insert;
	}
	
	public String[] genereInsertDeparment(int numbers) {
		
		String[] insert = new String[numbers];
		
		String[] name = { "Sistemas", "Administracion", "Contable", "Marketing", "Soporte", "Recursos Humanos", "Mantenimiento", "Produccion", "Ventas",
				"Juridico", "Financiero", "Comercial", "Logistica", "Control y gestión", "Compras",  "General", "Almacen", "Internacional" };


		for (int i = 0; i < numbers; i++) {
			insert[i] = "INSERT TO employee VALUES("
				+ (char)34 + "D"+ i + (char)34+", " 
				+ (char)34 + name[i] + (char)34+ ", "
				+ ");";

		}
		
		return insert;
	}
	
	
	
	
	
	
	
	private String genereteSex() {
		String[] genre = {"F", "M"};
		
		return (char)34 + genre[(int) (Math.floor(Math.random() * ((genre.length - 1  ) - 0 + 1) + 0))] + (char)34;
	}
	
	private String generateAddres() {
		
		String[] address = {"Avenida","Carrera", "Diagonal", "Transversal"};
		String[] address2 = {"Autopista","Calle","Piso", "Bis", "Via"};
		
		 String first = address[(int) (Math.floor(Math.random() * ((address.length - 1) - 0 + 1) + 0))];
		 String second = address[(int) (Math.floor(Math.random() * ((address.length - 1) - 0 + 1) + 0))];
		 
		return first + " "+((int) (Math.random() * 30) + 1) + " - "+second +" "+ ((int) (Math.random() * 30) + 1);
	}
	
	private String generateDOB() {
		
		int min = 1965;
		int max = 2003;
		Random rand = new Random();
		
		return ((int) (Math.random() * 28) + 1) + "/"+ ((int) (Math.random() * 11) + 1) +"/"+ (min + rand.nextInt(max - min) + 1);
		
	}

}
