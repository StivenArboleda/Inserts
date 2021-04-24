package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import model.Deparment;
import model.Generate;
public class Menu {
	private boolean exit;
	private BufferedReader bReader;
	private BufferedWriter bwriter;
	private Generate generate;
	
	private final String PRINCIPAL_MENU = "principal menu"
			+"\n1."
			+"\n2."
			+"\n3."
			+"\n4."+"\n5.Exit\n";
	
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
			break;
		}
		
	}
	
	private void runOptionOne(BufferedWriter bwriter) {
		boolean exit = false;
		while (!exit) {
			
			try {
				writeLine("Type the ammount of department inserts ",bwriter);
				
				int numInserts = Integer.parseInt(readLine(bReader));
				
				if (numInserts < 0) {
					throw new NumberFormatException();
				}
				
				List<Deparment> depList = new ArrayList<>();
				
				
				for (int i = 0; i < numInserts; i++) {
					
					writeLine(" - type Depto name: ",bwriter);
					String deptName = readLine(bReader);
					
					writeLine(" - type Depto number: ",bwriter);
					String deptNo = readLine(bReader);
					
					writeLine(" - type Depto boss id: ",bwriter);
					String mgrEmpNo = readLine(bReader);
					
					writeLine("NEW INSERT:", bwriter);
					
					
					Deparment dept = new Deparment(deptName,deptNo,mgrEmpNo);
					
					depList.add(dept);
				}

				generate.generateDeparment(depList);
				exit = true;
				
			} catch (IOException iOE) {
				// TODO: handle exception
			} catch (NumberFormatException nFE) {
				// TODO: handle exception
			}	
		}
		
	}
	
	private void runOptionTwo(BufferedWriter bwriter) {
		
	}
	
	private void runOptionThree(BufferedWriter bwriter) {
		
	}
	
	private void runOptionFour(BufferedWriter bwriter) {
		
	}
	
	
	
}
