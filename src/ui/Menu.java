package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import model.Deparment;
import model.Employee;
import model.Generate;
import model.Project;
import model.WorksOn;
public class Menu {
	
	private final String PATH = "data/Inserts.sql";
	private final String PRINCIPAL_MENU = "principal menu"
			+"\n1.Department."
			+"\n2.Employee."
			+"\n3.Proyect."
			+"\n4.Works On."
			+"\n5.Exit & generate.\n";
	
	private boolean exit;
	private BufferedReader bReader;
	private BufferedWriter bwriter;
	private Generate generate;
	
	private File file;
	
	public Menu() {
		exit = false;
		bReader = new BufferedReader(new InputStreamReader(System.in));
		bwriter = new BufferedWriter(new OutputStreamWriter(System.out));
		generate = new Generate();
		
	
	}
	
	public void start() {
		while (!exit) {
			try {
				
				writeLine(PRINCIPAL_MENU,bwriter);
				
				int option = Integer.parseInt(readLine(bReader));
				if (option < 1 && option > 5) {
					throw new NumberFormatException();
				}
				
				runOption(option, bwriter);
				
			} catch (IOException IOE) {
				// TODO: handle exception
			} catch (NumberFormatException NFE) {
				// TODO: handle exception
			}
				
		}
		
		try {
			
			writeLine("PROGRAM FINISHED",bwriter);
			
			bReader.close();
			bwriter.close();
			
		} catch (IOException IOE) {
			// TODO: handle exception
		} 
		
		
		
	}
	
	private String readLine(BufferedReader bReader) throws IOException{
		String str = "";
		while (str.equals("")) {
			str = bReader.readLine();

		}

		return str;
	}
	
	private void writeLine(String str, BufferedWriter bwriter) throws IOException{
		bwriter.write(str);
		bwriter.flush();
		
	}
	
	private void runOption(int op,BufferedWriter bwriter) {
		switch (op) {
		case 1:
			runOptionOne(bwriter);
			break;
		case 2:
			runOptionTwo(bwriter);
			break;
		case 3:
			runOptionThree(bwriter);
			break;
		case 4:
			runOptionFour(bwriter);
			break;
		case 5:
			exit = true;
			export();
			break;
		}
		
	}
	
	private void runOptionOne(BufferedWriter bwriter) {
		try {
			writeLine(" - type how many names you are going to generate: ", bwriter);
			int names = Integer.parseInt(readLine(bReader));
			String[] str = generate.genereInsertDeparment(names);
			
			for(int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
		}catch (IOException e) {
			// TODO: handle exception
		}
		
	}
		
	
	private void runOptionTwo(BufferedWriter bwriter) {
		try {
			writeLine(" - type how many names you are going to generate: ", bwriter);
			int names = Integer.parseInt(readLine(bReader));
			String[] str = generate.genereInsertEmployee(names);
			
			for(int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	private void runOptionThree(BufferedWriter bwriter) {
		boolean exit = false;
		while (!exit) {
			
			try {
				writeLine("Type the ammount of proyects inserts ",bwriter);
				
				int numInserts = Integer.parseInt(readLine(bReader));
				
				if (numInserts < 0) {
					throw new NumberFormatException();
				}
				
				List<Project> projList = new ArrayList<>();
				
				
				for (int i = 0; i < numInserts; i++) {
					
					writeLine(" - type Project number: ",bwriter);
					int projNo = Integer.parseInt(readLine(bReader));
					
					writeLine(" - type Project name: ",bwriter);
					String projName = readLine(bReader);
					
					writeLine(" - type Project depto number: ",bwriter);
					int deptNo = Integer.parseInt( readLine(bReader) );

					writeLine("\nNEW INSERT:", bwriter);		
					
					
					Project project = new Project(projNo, projName, deptNo);
					
					projList.add(project);
				}

				generate.generateProject(projList);
				exit = true;
				
			} catch (IOException iOE) {
				// TODO: handle exception
			} catch (NumberFormatException nFE) {
				// TODO: handle exception
			}
			
		}
	}
	
	private void runOptionFour(BufferedWriter bwriter) {
		boolean exit = false;
		while (!exit) {
			
			try {
				writeLine("Type the ammount of proyects inserts ",bwriter);
				
				int numInserts = Integer.parseInt(readLine(bReader));
				
				if (numInserts < 0) {
					throw new NumberFormatException();
				}
				
				List<WorksOn> wOList = new ArrayList<>();
				
				
				for (int i = 0; i < numInserts; i++) {
					
					writeLine(" - type current Project number: ",bwriter);
					int projNo = Integer.parseInt(readLine(bReader));
					
					writeLine(" - type current employee number: ",bwriter);
					int empNo = Integer.parseInt(readLine(bReader));
					
					writeLine(" - type the date worked: ",bwriter);
					String date = readLine(bReader);
					
					validateDateWO(date);
					
					writeLine(" - type the worked hours: ",bwriter);
					int hoursWorked = Integer.parseInt(readLine(bReader));

					writeLine("\nNEW INSERT:", bwriter);		
					
					
					WorksOn worksOn = new WorksOn(empNo, projNo, date, hoursWorked);
					
					wOList.add(worksOn);
					
				}

				generate.generateWorksOn(wOList);
				exit = true;
				
			} catch (IOException iOE) {
				// TODO: handle exception
			} catch (NumberFormatException nFE) {
				
			}
			
		}
		
	}
		
	
	private void validateDate(String dOB) throws NumberFormatException{
		
		String[] arDOB = dOB.split("/");

		if (!(arDOB.length == 3)) {
			throw new NumberFormatException("0");
			
		}else if (!(Integer.parseInt(arDOB[0]) > 0 && Integer.parseInt(arDOB[0]) <= 31)) {
			throw new NumberFormatException("1");
			
		}else if (!(Integer.parseInt(arDOB[1]) > 0 && Integer.parseInt(arDOB[1]) <= 12)) {
			throw new NumberFormatException("2");
			
		}else if (!(Integer.parseInt(arDOB[2]) > 1959 && Integer.parseInt(arDOB[2]) <= 2003)) {
			throw new NumberFormatException("3");
			
		}
		
	}
	
	private void validateDateWO(String dOB) throws NumberFormatException{
		String[] arDOB = dOB.split("/");

		if (!(arDOB.length == 3)) {
			throw new NumberFormatException("0");
			
		}else if (!(Integer.parseInt(arDOB[0]) > 0 && Integer.parseInt(arDOB[0]) <= 31)) {
			throw new NumberFormatException("1");
			
		}else if (!(Integer.parseInt(arDOB[1]) > 0 && Integer.parseInt(arDOB[1]) <= 12)) {
			throw new NumberFormatException("2");
			
		}else if (!(Integer.parseInt(arDOB[2]) > 1959 && Integer.parseInt(arDOB[2]) <= 2021)) {
			throw new NumberFormatException("3");
			
		}
		
	}
	
	
	private void export() {
		try {

			file = new File(PATH);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			
			FileWriter fWriter = new FileWriter(file);
			
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			
			if (!generate.getDeptInsert().equals("")) {
				bWriter.write(generate.getDeptInsert());
	
			}
			
			if (!generate.getEmpInsert().equals("")) {
				bWriter.write(generate.getEmpInsert());
	
			}
			
			if (!generate.getProjInsert().equals("")) {
				bWriter.write(generate.getProjInsert());
	
			}
			
			if (!generate.getwOInsert().equals("")) {
				bWriter.write(generate.getwOInsert());
	
			}
			

			bWriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
}
