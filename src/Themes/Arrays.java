package Themes;

public class Arrays {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char letter = 65;
        for(int i=0;i<alphabet.length;i++){
            alphabet[i] = letter;
            letter++;
        }
        for (char a: alphabet) {
            System.out.println(a);
        }
    }
}
