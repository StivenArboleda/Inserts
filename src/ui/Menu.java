package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import model.Generate;
public class Menu {
	
	private final String PATH = "data/Inserts.sql";
	private final String PRINCIPAL_MENU = "principal menu"
			+"\n 1.Employee."
			+"\n 2.Proyect."
			+"\n 4.Exit & generate.\n";
	
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
			runOptionTwo(bwriter);
			break;
		case 2:
			runOptionThree(bwriter);
			break;
		case 3:
			exit = true;
			export();
			break;
		}
		
	}
	
//	private void runOptionOne(BufferedWriter bwriter) {
//		try {
//			writeLine(" - type how many names you are going to generate: ", bwriter);
//			int names = Integer.parseInt(readLine(bReader));
//			if(names < 20) {
//				System.out.println("El número debe serinimo 20");
//				runOptionOne(bwriter);
//			}else {
//				String[] str = generate.genereInsertDeparment(names);
//				
//				for(int i = 0; i < str.length; i++) {
//					System.out.println(str[i]);
//				}
//			}
//			
//		}catch (IOException e) {
//			// TODO: handle exception
//		}
//		
//	}
		
	
	private void runOptionTwo(BufferedWriter bwriter) {
		try {
			writeLine(" - type how many EMPLOYEE you are going to generate: ", bwriter);
			int ammount = Integer.parseInt(readLine(bReader));
			if (ammount < 20) {
				throw new NumberFormatException();
			}
			String[] str = generate.generateInsertEmployee(ammount);
			
			for(int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			System.out.println(generate.generateUpdate());
			
		}catch (IOException e) {
			
		}catch (NumberFormatException NfE) {
			System.err.println("The number of employees must be over 20.");
			
		}
	}
	
	private void runOptionThree(BufferedWriter bwriter) {
		try {
			writeLine(" - type how many PROJECTS you are going to generate: ", bwriter);
			int ammount  = Integer.parseInt(readLine(bReader));
			if (ammount < 20) {
				throw new NumberFormatException();
			}
			String[] str = generate.generateInsertProject(ammount);
			//System.out.println(generate.generateInsertProject(names));
			for(int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
		}catch (IOException e) {
			// TODO: handle exception
		}catch (NumberFormatException NfE) {
			System.err.println("The number of employees must be over 20.");
			
		}
	}

		
//	
//	private void validateDate(String dOB) throws NumberFormatException{
//		
//		String[] arDOB = dOB.split("/");
//
//		if (!(arDOB.length == 3)) {
//			throw new NumberFormatException("0");
//			
//		}else if (!(Integer.parseInt(arDOB[0]) > 0 && Integer.parseInt(arDOB[0]) <= 31)) {
//			throw new NumberFormatException("1");
//			
//		}else if (!(Integer.parseInt(arDOB[1]) > 0 && Integer.parseInt(arDOB[1]) <= 12)) {
//			throw new NumberFormatException("2");
//			
//		}else if (!(Integer.parseInt(arDOB[2]) > 1959 && Integer.parseInt(arDOB[2]) <= 2003)) {
//			throw new NumberFormatException("3");
//			
//		}
//		
//	}
	
//	private void validateDateWO(String dOB) throws NumberFormatException{
//		String[] arDOB = dOB.split("/");
//
//		if (!(arDOB.length == 3)) {
//			throw new NumberFormatException("0");
//			
//		}else if (!(Integer.parseInt(arDOB[0]) > 0 && Integer.parseInt(arDOB[0]) <= 31)) {
//			throw new NumberFormatException("1");
//			
//		}else if (!(Integer.parseInt(arDOB[1]) > 0 && Integer.parseInt(arDOB[1]) <= 12)) {
//			throw new NumberFormatException("2");
//			
//		}else if (!(Integer.parseInt(arDOB[2]) > 1959 && Integer.parseInt(arDOB[2]) <= 2021)) {
//			throw new NumberFormatException("3");
//			
//		}
//		
//	}
	
	
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
