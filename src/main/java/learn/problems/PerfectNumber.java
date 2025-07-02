package learn.problems;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if(number > 0){
            for(int i=1; i < number; i++){
                if(number%i == 0 ){
                    sum=sum+i;
                }
            }
            if(sum == number){
                System.out.println("The Number "+ number+ " is perfect number because the sum of divides is : "+sum);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectNumber.isPerfectNumber(6);
    }
}
