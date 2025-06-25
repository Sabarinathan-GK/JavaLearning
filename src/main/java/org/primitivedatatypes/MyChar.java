package org.primitivedatatypes;

public class MyChar {
    private char charValue;

    public MyChar(char charValue) {
        this.charValue = charValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public boolean isVowel(){
        if(this.charValue == 'a' || this.charValue == 'e' || this.charValue == 'i' || this.charValue == 'o' || this.charValue == 'u'){
            return true;
        }else if(this.charValue == 'A' || this.charValue == 'E' || this.charValue == 'I' || this.charValue == 'O' || this.charValue == 'U'){
            return true;
        }
        return false;
    }

    public boolean isConsonant(){
        if( isAlphabet() && !isVowel()){
            return true;
        }
        return false;
    }

    public boolean isDigit(){
        if( this.charValue >= 48 && this.charValue <= 57){
            return true;
        }
        return false;
    }

    public boolean isAlphabet(){
        if( this.charValue >= 97 && this.charValue <= 122){
            return true;
        } else if( this.charValue >= 65 && this.charValue <= 90){
            return true;
        }
        return false;
    }

    public char upperCase(){
        return Character.toUpperCase(this.charValue);
    }

    public char lowerCase(){
        return Character.toLowerCase(this.charValue);
    }
}
