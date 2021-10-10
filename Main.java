package Laborator3;
import Laborator3.Text;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Basic Level:");
        System.out.println("Introduceti textul:");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Text textInput = new Text(text);

        System.out.println("Numarul propozitiilor: " + textInput.NumarPropozitii());
        System.out.println("Numarul cuvintelor:" + textInput.NumarCuvinte());

        System.out.println("\nAdvanced Level (1):");
        System.out.println("Litere: " + textInput.NumarLitere());
        System.out.println("Vocale: " + textInput.NumarVocale());
        System.out.println("Consoane: " + textInput.NumarConsoane());

        System.out.println("\nAdvanced Level (2):");
        System.out.println("Cel mai frecvent cuvant este: " + textInput.Repetare());
        System.out.println("Cel mai lung cuvant este: " + textInput.Lungime());
    }
}