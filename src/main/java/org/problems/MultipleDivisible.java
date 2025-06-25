package org.problems;

public class MultipleDivisible {
    private int number1;
    private int number2;

    public MultipleDivisible(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int greatestCommonDivisor(){
        if(this.number1 == 0 || this.number2 == 0){
            return 0;
        }else if(this.number1 == this.number2){
            return this.number1;
        }else{
//            int min = (this.number1 > this.number2) ? number2 : number1;
//            for (int i = min; i > 0 ; i++) {
//                if((this.number1%i==0)&& (this.number2%i==0)){
//                    return i;
//                }
//            }

            int max = (number1 < number2)? number2 : number1;
            int i = max;
            while(i>0){
                if((number1%i==0)&&(number2%i==0)){
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public int leastCommonMultiplayer() {
        int lcm = 0;
        if (this.number1 == 0 || this.number2 == 0) {
            return 0;
        } else if (this.number1 == this.number2) {
            return this.number1;
        } else {
//            int min = (this.number1 > this.number2) ? number2 : number1;
//            for (int i = min; i > 0 ; i++) {
//                if((this.number1%i==0)&& (this.number2%i==0)){
//                    return i;
//                }
//            }

            int max = Math.max(number1, number2);
            lcm = max;
            while (lcm > 0) {
                boolean isMaxLcm = (lcm % number1 == 0 && lcm % number2 == 0);
                if (isMaxLcm) {
                    return lcm;
                }
                lcm += max;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        MultipleDivisible md = new MultipleDivisible(6,8);
        System.out.println(md.greatestCommonDivisor());
        System.out.println(md.leastCommonMultiplayer());
    }
}
