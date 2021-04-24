package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Menu {
	private boolean exit;
	private BufferedReader bReader;
	private BufferedWriter bwriter;
	
	public Menu() {
		exit = false;
		bReader = new BufferedReader(new InputStreamReader(System.in));
		bwriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	}
	
	public void start() {
		while (!exit) {
			try {
				
				showPrincipalMenu(bwriter);
				int option = Integer.parseInt(readLine(bReader));
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
			
			writeLine("PROGRAM FINISHED",bwriter);
			
			bReader.close();
			bwriter.close();
			
		} catch (IOException IOE) {
			// TODO: handle exception
		} 
		
		
		
	}
	
	private void showPrincipalMenu(BufferedWriter bwriter) throws IOException{
		writeLine("principal menu"+"\n1."+"\n2."+"\n3."+"\n4."+"\n5.Exit\n",bwriter);
		
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
