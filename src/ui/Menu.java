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
			+"\n 3.Exit & generate.\n";
	
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
				
			} catch (IOException iOE) {
				System.err.println("Unexpected error.");
				iOE.printStackTrace();
			} catch (NumberFormatException NFE) {
				System.err.println("Invalid option, please enter one of the following numbers: 1,2,3.");
			}
				
		}
		
		try {
			
			writeLine("PROGRAM FINISHED",bwriter);
			
			bReader.close();
			bwriter.close();
			
		} catch (IOException iOE) {
			System.err.println("Unexpected error.");
			iOE.printStackTrace();
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
			exit = true;
			export();
			break;
		}
		
	}
	
	private void runOptionOne(BufferedWriter bwriter) {
		try {
			writeLine(" - type how many EMPLOYEE you are going to generate: ", bwriter);
			int ammount = Integer.parseInt(readLine(bReader));
			if (ammount < 20) {
				throw new NumberFormatException();
			}
			
			generate.generateInsertEmployee(ammount);
			
		}catch (IOException iOE) {
			System.err.println("Unexpected error.");
			iOE.printStackTrace();
		}catch (NumberFormatException NfE) {
			System.err.println("The number of employees must be over 20.");
			
		}
	}
	
	private void runOptionTwo(BufferedWriter bwriter) {
		try {
			writeLine(" - type how many PROJECTS you are going to generate: ", bwriter);
			int ammount  = Integer.parseInt(readLine(bReader));
			if (ammount < 20) {
				throw new NumberFormatException();
			}
			
			generate.generateInsertProject(ammount);

		}catch (IOException iOE) {
			System.err.println("Unexpected error.");
			iOE.printStackTrace();
		}catch (NumberFormatException NfE) {
			System.err.println("The number of projects must be over 20.");
			
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
			
			bWriter.write(generate.generateUpdate());
			
			bWriter.close();
			
		} catch (IOException iOE) {
			System.err.println("Unexpected error.");
			iOE.printStackTrace();
		}
	}

	
	
}
