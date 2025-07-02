package learn.problems;

public class RightAngleTriangle {
    public static boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if ((side1 * side1) + (side2 * side2) == (side3 * side3)) {
                return true;
            } else if ((side2 * side2) + (side3 * side3) == (side1 * side1)) {
                return true;
            } else if ((side3 * side3) + (side1 * side1) == (side2 * side2)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRightAngled(4,3,5));
        System.out.println(isRightAngled(1,3,5));
        System.out.println(isRightAngled(2,0,5));
    }
}
