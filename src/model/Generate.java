package model;

import java.util.Random;

public class Generate {
	
	private String[] deptInsert;
	private String[] empInsert;
	private String[] projInsert;
	private String wOInsert;
	//private String idDept;
	
	
	public Generate() {
		deptInsert = genereInsertDeparment(20);
		empInsert = new String [] {};
		projInsert = new String [] {};
		wOInsert = "";
		//idDept = "";
		
	}


	public String getDeptInsert() {
		String re = "";
		for (int i = 0; i < deptInsert.length; i++) {
			re += deptInsert[i] +"\n";
		}
		
		return re;
	}

	public String getEmpInsert() {
		String re = "";
		for (int i = 0; i < empInsert.length; i++) {
			re += empInsert[i] +"\n";
		}
		//re += generateUpdate();
		return re;
	}

	public String getProjInsert() {
		String re = "";
		for (int i = 0; i < projInsert.length; i++) {
			re += projInsert[i] +"\n";
		}

		return re;
	}

	public String getwOInsert() {
		return wOInsert;
	}
	
	
	//===================================INSERT EMPLOYEE===================================================
	
	public String[] generateInsertEmployee(int ammount) {
		
		String[] insert = new String[ammount];
		
		String[] name = { "Andrea", "David", "Bartolome", "Alejandoro", "Striven", "Baltasar", "Sebastian", "Bartolo", "Bartolomé", "Lorena", 
				"Isabella", "Valentina", "Daniela", "Andrea", "Carlos", "Laura", "Carolina", "Camila", "Jesús", "Miguel"};
		
		String[] lastname = { "Gomez", "Guerrero", "Cardenas", "Ordoñez", "Cardona", "Cardoso", "Polo", "Carillo", "Hurtado", "Castillo", 
				"Castaño", "Castro", "Garcia", "Arboleda", "Henao", "Cortes", "Mora", "Ortiz" };
		
		String[] position = {"Maquinario", "De planta", "Operario", "Supervisor"};
		

		for (int i = 0; i < ammount; i++) {
			
			if( i < 20) {
				insert[i] = "INSERT INTO EMPLOYEE VALUES(" 
				+ (char)39 + "E-"+ i + (char)39+", " 
				+ (char)39 + name[(int) (Math.floor(Math.random() * ((name.length - 1  ) - 0 + 1) + 0))] + (char)39+ ", "
				+ (char)39 + lastname[(int) (Math.floor(Math.random() * ((lastname.length - 1) - 0 + 1) + 0))]+ (char)39+ ", "
				+ (char)39 + generateAddres() + (char)39+ ", "
				+ (char)39 + generateDOB()+(char)39+ ", "
				+ genereteSex() +", "
				+ (char)39 + "Jefe" + (char)39 + ", "
				+ (char)39 + "D" + i +(char)39 + ");";
			}else {
				insert[i] = "INSERT INTO EMPLOYEE VALUES(" 
				+ (char)39 + "E-"+ i + (char)39+", " 
				+ (char)39 + name[(int) (Math.floor(Math.random() * ((name.length - 1  ) - 0 + 1) + 0))] + (char)39+ ", "
				+ (char)39 + lastname[(int) (Math.floor(Math.random() * ((lastname.length - 1) - 0 + 1) + 0))]+ (char)39+ ", "
				+ (char)39 + generateAddres() + (char)39+ ", "
				+ (char)39 + generateDOB()+(char)39+ ", "
				+ genereteSex() +", "
				+ (char)39 + position[(int) (Math.floor(Math.random() * ((position.length - 1) - 0 + 1) + 0))]+ (char)39 + ", " 
				+ (char)39 + "D" +((int) (Math.random() * 20)) + (char)39 + ");";
			}				
		}
		
		empInsert = insert;
		
		return insert;
	}
	
	public String[] genereInsertDeparment(int numbers) {
		
		String[] insert = new String[numbers];
		
		String[] name = { "Sistemas", "Administracion", "Contable", "Marketing", "Soporte", "Recursos Humanos", "Mantenimiento", "Produccion", "Ventas",
				"Juridico", "Financiero", "Comercial", "Logistica", "Control y gestión", "Compras",  "General", "Almacen", "Internacional", "Calidad","Inventario"};


		for (int i = 0; i < name.length; i++) {
			insert[i] = "INSERT INTO DEPARTMENT VALUES("
				+ (char)39 + "D"+ i + (char)39+", " 
				+ (char)39 + name[i] + (char)39+ ", "
				+ "NULL);";
		//	idDept += "D"+ i +","; 
		}

		return insert;
	}
	
	
	private String genereteSex() {
		String[] genre = {"F", "M"};
		
		return (char)39 + genre[(int) (Math.floor(Math.random() * ((genre.length - 1  ) - 0 + 1) + 0))] + (char)39;
	}
	
	private String generateAddres() {
		
		String[] address = {"Avenida","Carrera", "Diagonal", "Transversal"};
		String[] address2 = {"Autopista","Calle","Piso", "Bis", "Via"};
		
		 String first = address[(int) (Math.floor(Math.random() * ((address.length - 1) - 0 + 1) + 0))];
		 String second = address2[(int) (Math.floor(Math.random() * ((address.length - 1) - 0 + 1) + 0))];
		 
		return first + " "+((int) (Math.random() * 30) + 1) + " - "+second +" "+ ((int) (Math.random() * 30) + 1);
	}
	
	private String generateDOB() {
		
		int min = 1949;
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
			insert[i] = "";
			insert[i] += "INSERT INTO PJCT VALUES("
				+ (char)39 + "PROJ-"+ i + (char)39+", " 
				+ (char)39 + name[(int) (Math.floor(Math.random() * ((name.length - 1  ) - 0 + 1) + 0))] + (char)39+ ", "
				+ (char)39 + "D"+((int)(Math.random() * 19)+1) + (char)39 + ");";
		}
		
		for (int i = 0; i < numbers; i++) {
			inserts2[i] = "";
			inserts2[i] += "INSERT INTO WORKSON VALUES("
					+ (char)39 + "E-"+ ((int) (Math.random() * 19)) + (char)39+", " 
					+ (char)39 + "PROJ-" + i +(char)39+ ", "
					+ (char)39 + generateDateWorks() + (char)39 + ", "
					+ (char)39 + ((int) (Math.random() * 150) + 1 ) + (char)39 + ");";
		}
		
		int len = insert.length + inserts2.length;
		String[] inserts3 = new String[len];
		
		System.arraycopy(insert, 0, inserts3, 0, insert.length);
		System.arraycopy(inserts2, 0, inserts3, insert.length, inserts2.length);
		
		projInsert = inserts3;
		
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
			str += "\nUPDATE DEPARTMENT \n"
				+ "SET mgrEmpNo = "
				+ (char)39 + "E-" + i + (char)39 + "\n"
				+ "WHERE deptNo = "
				+ (char)39 + "D" + i + (char)39 +";\n";
		}
		
		return str;
	}

}
