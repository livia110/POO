package laboratory_04;

import java.io.File;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) throws Exception
            {
                File file = new File("C:\\Users\\Livika\\Desktop\\java\\Laboratory_04\\src\\laboratory_04\\three_expressions.txt");
                Scanner sc = new Scanner(file);
                System.out.println("File Expression:");
                while (sc.hasNextLine()) {
                    String input = sc.nextLine();
                    String inputWithoutSpaces = input.replaceAll("\\s+","");
                    System.out.println(input);

                    if (ParenthesisValidation.checkParenthesis((inputWithoutSpaces))) {
                        System.out.println("Expression is: TRUE!");
                    }

                    else {
                        System.out.println("Expression is: FALSE!");
                    }
                }
                sc.close();
            }
        }