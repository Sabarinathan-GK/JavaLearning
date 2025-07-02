package learn.problems;

public class NumberDigitProblems {
    int number;

    public NumberDigitProblems(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int findLastDigit(){
        int number = this.number;
        if(number < 0){
            return -1;
        }
        return number%10; // 101 --> 1
    }

    public int findNumberOfDigit(){
        int numDigit = 0;
        int number = this.number;
        if( number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        while(number > 0 ){
            number = number / 10; // 101 - 1 -- 10 -- 1
            numDigit++;
        }
        return numDigit;
    }

    public int sumOfDigit(){
        int sumDigit = 0;
        int digit = 0;
        int number = this.number;
        if(number < 0){
            return -1;
        }else if(number == 0){
            return 0;
        }else {
            while (number > 0) {
                digit = number % 10;
                sumDigit += digit;
                number /= 10;
            }
            return sumDigit;
        }
    }

    public int reverseNumber(){
        int revNum = 0;
        int digit = 0;
        int number = this.number;
        if(number < 0){
            return -1;
        }else if(number == 0){
            return 0;
        }else {
            while (number > 0) {
                digit = number % 10;
                revNum = (revNum * 10) + digit;
                number /= 10;
            }
            return revNum;
        }
    }

    public long factorialOfNumber(){
        if(this.number<0){
            return 1;
        }else if(this.number == 0){
            return 0;
        }else {
            long factorial = 1;
            for(int i = 2; i<=this.number; i++){
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        NumberDigitProblems numDigit = new NumberDigitProblems(70);
        System.out.println("The last digit of "+numDigit.getNumber()+" is = "+numDigit.findLastDigit());
        System.out.println("The number digit of "+numDigit.getNumber()+" is = "+numDigit.findNumberOfDigit());
        System.out.println("The sum of digit of "+numDigit.getNumber()+" is = "+numDigit.sumOfDigit());
        System.out.println("The reverse number of "+numDigit.getNumber()+" is = "+numDigit.reverseNumber());
        System.out.println("The Factorial of  "+numDigit.getNumber()+" is = "+numDigit.factorialOfNumber());
    }

}
