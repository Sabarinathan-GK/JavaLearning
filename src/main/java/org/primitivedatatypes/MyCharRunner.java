package org.primitivedatatypes;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar cValue = new MyChar('B');
        System.out.println("Is the char value is vowel : "+cValue.isVowel());
        System.out.println("Is the char value is Consonant : "+cValue.isConsonant());
        System.out.println("Is the char value is digit : "+cValue.isDigit());
        System.out.println("Is the char value is Alphabet : "+cValue.isAlphabet());
        System.out.println("Is the char value in Uppercase : "+cValue.upperCase());
        System.out.println("Is the char value is Lowercase : "+cValue.lowerCase());
    }
}
