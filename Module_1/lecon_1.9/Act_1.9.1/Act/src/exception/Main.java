package exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			try {
            int userInput = readUserInput();
            if (userInput < 10 || userInput > 30) {
                throw new Exception("The value is not in the allowed interval");
            } else {
                System.out.println("L'entier saisi est : " + userInput);
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());

        }
    }
  public static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre entre 10 et 30 inclus : ");
        int userInput = scanner.nextInt();
        scanner.close();
        return userInput;
    }
    }




