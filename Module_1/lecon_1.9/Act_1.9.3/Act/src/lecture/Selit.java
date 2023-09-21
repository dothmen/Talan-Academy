package lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Selit {

	public static void main(String[] args) {
		try {	
		  BufferedReader reader = new BufferedReader(new FileReader("src//lecture//Selit.java"));
		  List<String> lines = new ArrayList<>();
		  String line;
          while ((line = reader.readLine()) != null) {
              lines.add(line);
          }
         reader.close();
           System.out.println("Contenu du fichier :");

          for (String l : lines) {

              System.out.println(l);
        }
   System.out.println("\nContenu du fichier à l'envers :");

          Collections.reverse(lines);

          for (String l : lines) {

              System.out.println(l);

          }
         for (int i = 0; i < lines.size(); i++) {

              String fileName = "monFichier_L" + (i + 1) + ".txt";

              BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

              writer.write(lines.get(i));

              writer.close();
        }

      } catch (IOException e) {

          e.printStackTrace();
      }
  }
}