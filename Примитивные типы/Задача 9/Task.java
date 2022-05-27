import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {

    }
    public int determineGroup(int age) {
        int[] firstGroup = {7, 13};
        int[] secondGroup = {14, 17};
        int[] thirdGroup = {18, 65};
        if (age >= firstGroup[0] && age <= firstGroup[1]) {
            return 1;
        } else if (age >= secondGroup[0] && age <= secondGroup[1]) {
            return 2;
        } else if (age >= thirdGroup[0] && age <= thirdGroup[1]) {
            return 3;
        } else {
            return -1;
        }
    }
}