package catcher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MaximumWithoutExceptions {
	public static void main(String[] args)   {
		
		try {	
	          BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dothmen\\Documents\\Talan-Academy\\Module_1\\lecon_1.9\\Act_1.9.2\\data.txt"));
             int max = -1;
            String line = br.readLine();
            
            while (line != null) {
                try {
            	
                    int n = Integer.parseInt(line);
                    if (n > max) {
                        max = n;
                    }
                    line = br.readLine();
                } catch (NumberFormatException e) {
                    System.err.println("NumberFormatException: " + e.getMessage());
                    line = br.readLine();
                }
            }
            System.out.println("Maximum = " + max);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}