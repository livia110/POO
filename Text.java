package Laborator3;
import java.util.*;

public class Text {

    String text;
    char[] textArray;
    int propozitie = 0;
    int vocala = 0;
    int litera = 0;

    public Text(String text) {
        this.text = text;
        this.textArray = this.text.toCharArray();
    }

    public int NumarPropozitii() {
        for (int i = 0; i < this.textArray.length; i++) {

            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                propozitie++;
            }

        }
        return propozitie;
    }

    public int NumarCuvinte() {
        int count = 1;
        for (int i = 0; i <= text.length() - 1; i++) {
            if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }
    public int NumarLitere() {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                litera++;
        }
        return litera;
    }


    public int NumarVocale() {
        for (int i = 0; i < this.textArray.length; i++) {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a' || text.charAt(i) == 'E' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'I' || text.charAt(i) == 'i' || text.charAt(i) == 'O'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'U' || text.charAt(i) == 'u'){
                vocala++;
            }
        }
        return vocala;
    }

    public int NumarConsoane() {
        return (NumarLitere() - NumarVocale()) / 2;
    }

    public String Lungime() {
        String[] cuvinte = this.text.split("\\s+");
        for (int i = 0; i < cuvinte.length; i++) {
            cuvinte[i] = cuvinte[i].replaceAll("[^\\w]", "");
        }
        int index = 0;
        int elementLength = cuvinte[0].length();
        for (int i = 1; i < cuvinte.length; i++) {
            if (cuvinte[i].length() > elementLength) {
                index = i;
                elementLength = cuvinte[i].length();
            }
        }
        return cuvinte[index];
    }

    String Repetare () {

        String[] arr = this.text.split("\\s+");
        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            } else {
                hs.put(arr[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = hs.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }
        return key;
    }
}