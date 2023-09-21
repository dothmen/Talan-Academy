package analyse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Analyse {

	public static void main(String[] args) {
		try {	
			  BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dothmen\\Documents\\Talan-Academy\\Module_1\\lecon_1.9\\Act_1.9.4\\texte.txt"));
			  List<String> listeMot = new ArrayList<>();
			  String line;
	          while ((line = reader.readLine()) != null) {
	        	  System.out.println(line);     	  
	          }
	          reader.close();
	          List<String> motsExtraits = new ArrayList<>();
	          for (int i = 0; i < listeMot.size(); i += 2) {
	              motsExtraits.add(listeMot.get(i));
	          }  
	          for (int i = 0; i < listeMot.size(); i++) {

	              String fileName = "monFichier.txt";
	              BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	              for (String mot : motsExtraits) {
		           writer.write(mot);
	              writer.write(" ");
	              }
	              writer.close();
	        }
		} catch (IOException e) {
            e.printStackTrace();
		}
 		}}