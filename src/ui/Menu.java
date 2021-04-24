package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Menu {
	private boolean exit;
	
	
	public Menu() {
		exit = false;
	}
	
	public void start() {
		while (!exit) {
			try {
				
				showPrincipalMenu();
				int option = Integer.parseInt(readLine());
				if (option < 1 && option > 5) {
					throw new NumberFormatException();
				}
				
				runOption(option);
				
			} catch (IOException IOE) {
				// TODO: handle exception
			} catch (NumberFormatException NFE) {
				// TODO: handle exception
			}
				
		}
		
		try {
			
			writeLine("PROGRAM FINISHED");
			
		} catch (IOException IOE) {
			// TODO: handle exception
		} 
		
		
		
	}
	
	private void showPrincipalMenu() throws IOException{
		writeLine("principal menu"+"\n1."+"\n2."+"\n3."+"\n4."+"\n5.Exit\n");
		
	}
	
	private String readLine() throws IOException{
		String str = "";
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		while (str.equals("")) {
			str = bReader.readLine();

		}
		
		bReader.close();
		return str;
	}
	
	private void writeLine(String str) throws IOException{
		BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bwriter.write(str);
		bwriter.close();
		
	}
	
	private void runOption(int op) {
		switch (op) {
		case 1:
			runOptionOne();
			break;
		case 2:
			runOptionTwo();
			break;
		case 3:
			runOptionThree();
			break;
		case 4:
			runOptionFour();
			break;
		case 5:
			exit = true;
			break;
		}
		
	}
	
	private void runOptionOne() {
		
	}
	
	private void runOptionTwo() {
		
	}
	
	private void runOptionThree() {
		
	}
	
	private void runOptionFour() {
		
	}
	
	
	
}
