package org.problems;

public class WhileLoopProblem {
    private int limit;
    private int number;

    public WhileLoopProblem(int limit, int number) {
        this.limit = limit;
        this.number = number;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printSquresUptoLimit(){
        int i =1;
        int squre = 0;
        while ( i <= this.number){
            squre = i * i;
            if(squre <= this.limit){
                System.out.print( squre + "\t");
                i++;
            }else{
                break;
            }

        }
    }

    public void printCubesUptoLimit(){
        int i = 1;
        int cube =0;
        while ( i < this.number ){
            cube = i * i * i;
            if(cube <= this.limit){
                System.out.print(cube + "\t");
                i++;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        WhileLoopProblem wl = new WhileLoopProblem(30, 10);
        wl.printSquresUptoLimit();
        System.out.println();
        wl.printCubesUptoLimit();
    }
}
