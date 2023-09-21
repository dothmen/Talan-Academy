package analyse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Analyse {

	public static void main(String[] args) {
		try {	
			  BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dothmen\\Documents\\Talan-Academy\\Module_1\\lecon_1.9\\Act_1.9.4\\texte.txt"));
			  String line;
	          while ((line = reader.readLine()) != null) {
	        	  System.out.println(line);     	  
	          }
	          reader.close();
	           
		} catch (IOException e) {
            e.printStackTrace();
		}
  	}
		}