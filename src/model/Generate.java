package model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generate {
	
	private String[] deptInsert;
	private String[] empInsert;
	private String projInsert;
	private String wOInsert;
	private String idDept;
	
	
	public Generate() {
		deptInsert = genereInsertDeparment(20);
		empInsert = new String [] {};
		projInsert = "";
		wOInsert = "";
		idDept = "";
		
	}


	public String getDeptInsert() {
		String re = "";
		for (int i = 0; i < deptInsert.length; i++) {
			re += deptInsert[i] +"\n";
		}
		re = generateUpdate();
		return re;
	}

	public String getEmpInsert() {
		String re = "";
		for (int i = 0; i < deptInsert.length; i++) {
			
		}
		return re;
	}

	public String getProjInsert() {
		return projInsert;
	}

	public String getwOInsert() {
		return wOInsert;
	}
	
	
	//===================================INSERT EMPLOYEE===================================================
	
	public String[] genereInsertEmployee(int numbers) {
		
		
		String[] insert = new String[numbers];
		
		String[] name = { "Andrea", "David", "Bartolome", "Alejandoro", "Striven", "Baltasar", "Sebastian", "Bartolo", "Bartolomé", "Lorena", 
				"Isabella", "Valentina", "Daniela", "Andrea", "Carlos", "Laura", "Carolina", "Camila", "Jesús", "Miguel"};
		
		String[] lastname = { "Gomez", "Guerrero", "Cardenas", "Ordoñez", "Cardona", "Cardoso", "Polo", "Carillo", "Hurtado", "Castillo", 
				"Castaño", "Castro", "Garcia", "Arboleda", "Henao", "Cortes", "Mora", "Ortiz" };
		
		String[] position = {"Maquinario", "De planta", "Operario", "Supervisor"};
		

		for (int i = 0; i < numbers; i++) {
			
			if( i < 20) {
				insert[i] = "INSERT TO employee VALUES(" 
				+ (char)34 + "E-"+ i + (char)34+", " 
				+ (char)34 + name[(int) (Math.floor(Math.random() * ((name.length - 1  ) - 0 + 1) + 0))] + (char)34+ ", "
				+ (char)34 + lastname[(int) (Math.floor(Math.random() * ((lastname.length - 1) - 0 + 1) + 0))]+ (char)34+ ", "
				+ (char)34 + generateAddres() + (char)34+ ", "
				+ (char)34 + generateDOB()+(char)34+ ", "
				+ genereteSex() +", "
				+ (char)34 + "Jefe" + (char)34 + ", "
				+ (char)34 + "E" + i +(char)34 + ");";
			}else {
				insert[i] = "INSERT TO employee VALUES(" 
				+ (char)34 + "E-"+ i + (char)34+", " 
				+ (char)34 + name[(int) (Math.floor(Math.random() * ((name.length - 1  ) - 0 + 1) + 0))] + (char)34+ ", "
				+ (char)34 + lastname[(int) (Math.floor(Math.random() * ((lastname.length - 1) - 0 + 1) + 0))]+ (char)34+ ", "
				+ (char)34 + generateAddres() + (char)34+ ", "
				+ (char)34 + generateDOB()+(char)34+ ", "
				+ genereteSex() +", "
				+ (char)34 + position[(int) (Math.floor(Math.random() * ((position.length - 1) - 0 + 1) + 0))]+ (char)34 + ", " 
				+ (char)34 + "E" +((int) (Math.random() * 20)) + (char)34 + ");";
			}				
		}
		
		return insert;
	}
	
	public String[] genereInsertDeparment(int numbers) {
		
		String[] insert = new String[numbers];
		
		String[] name = { "Sistemas", "Administracion", "Contable", "Marketing", "Soporte", "Recursos Humanos", "Mantenimiento", "Produccion", "Ventas",
				"Juridico", "Financiero", "Comercial", "Logistica", "Control y gestión", "Compras",  "General", "Almacen", "Internacional", "Calidad","Inventario"};


		for (int i = 0; i < name.length; i++) {
			insert[i] = "INSERT TO deparment VALUES("
				+ (char)34 + "D"+ i + (char)34+", " 
				+ (char)34 + name[i] + (char)34+ ", "
				+ "NULL);";
			idDept += "D"+ i +","; 
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
		 String second = address2[(int) (Math.floor(Math.random() * ((address.length - 1) - 0 + 1) + 0))];
		 
		return first + " "+((int) (Math.random() * 30) + 1) + " - "+second +" "+ ((int) (Math.random() * 30) + 1);
	}
	
	private String generateDOB() {
		
		int min = 1965;
		int max = 2003;
		Random rand = new Random();
		
		return ((int) (Math.random() * 28) + 1) + "/"+ ((int) (Math.random() * 11) + 1) +"/"+ (min + rand.nextInt(max - min) + 1);
		
	}
	//======================INSERT PROJECT========================
	
	public String[] generateInsertProject(int numbers) {

		String[] insert = new String[numbers];
		String[] inserts2 = new String[numbers];

		String[] name = { "Crecimiento", "Exportar", "Importar", "Expansion", "Franquicias", "Migrar",
				"Revision", "Publicidad"};
		
		for (int i = 0; i < numbers; i++) {
			
			insert[i] += "INSERT TO project VALUES("
				+ (char)34 + "PROJ-"+ i + (char)34+", " 
				+ (char)34 + name[(int) (Math.floor(Math.random() * ((name.length - 1  ) - 0 + 1) + 0))] + (char)34+ ", "
				+ (char)34 + "E"+((int)(Math.random() * 19)+1) + (char)34 + ");";
		}
		
		for (int i = 0; i < numbers; i++) {
			
			inserts2[i] += "INSERT TO worksOn VALUES("
					+ (char)34 + "E-"+ ((int) (Math.random() * 19)) + (char)34+", " 
					+ (char)34 + "PROJ-" + i +(char)34+ ", "
					+ (char)34 + generateDateWorks() + (char)34 + ", "
					+ (char)34 + ((int) (Math.random() * 150) + 1 ) + (char)34 + ");";
		}
		
		int len = insert.length + inserts2.length;
		String[] inserts3 = new String[len];
		
		 
		System.arraycopy(insert, 0, inserts3, 0, insert.length);
		System.arraycopy(inserts2, 0, inserts3, insert.length, inserts2.length);

		return inserts3;

	}
	private String generateDateWorks() {
		
		int min = 2010;
		int max = 2020;
		Random rand = new Random();
		
		return ((int) (Math.random() * 28) + 1) + "/"+ ((int) (Math.random() * 11) + 1) +"/"+ (min + rand.nextInt(max - min) + 1);
		
	}
	
	
	//====================UPDATE FOR DEPARMENT=====================
	//==========================ADD A BOSS=========================
	public String generateUpdate() {
		
		String str = "";
		
		for (int i = 0; i < 20; i++) {
			str += "\nUPDATE deparment \n"
				+ "SET mgrEmpNo = E-" + i + "\n"
				+ "WHERE deptNo = D" + i + "\n";
		}
		
		return str;
	}

}
