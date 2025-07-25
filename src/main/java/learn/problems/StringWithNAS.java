package learn.problems;

public class StringWithNAS {
    public static void reverseString(String str){
        String revStr = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }

    private static void splitStringBuffer(String input) {
        StringBuffer alphaBuffer = new StringBuffer(),
                numberBuffer = new StringBuffer(), specialBuffer = new StringBuffer();

        for (int i=0; i<input.length(); i++)
        {
            if (Character.isDigit(input.charAt(i)))
                numberBuffer.append(input.charAt(i));
            else if(Character.isAlphabetic(input.charAt(i)))
                alphaBuffer.append(input.charAt(i));
            else
                specialBuffer.append(input.charAt(i));
        }

        System.out.println(alphaBuffer);
        reverseString(alphaBuffer.toString());
        System.out.println(numberBuffer);
        reverseString(numberBuffer.toString());
        System.out.println(specialBuffer);
        reverseString(specialBuffer.toString());
    }

    private static void splitString(String input) {
        String alpha = "", number="", special="";
        for(char temp : input.toCharArray()){
            if(temp >= 'a' && temp <= 'z'){
                alpha += temp;
            }else if(Character.isDigit(temp)){
                number += temp;
            }else{
                special+= temp;
            }
        }
        System.out.println(alpha);
        reverseString(alpha);
        System.out.println(number);
        reverseString(number);
        System.out.println(special);
        reverseString(special);
    }

    public static void main(String[] args) {
        String input = "geeks01for02geeks03!!!";
        splitString(input);
        String ipBuffer = "**Docoding123456789everyday##";
        splitStringBuffer(ipBuffer);
    }
}
