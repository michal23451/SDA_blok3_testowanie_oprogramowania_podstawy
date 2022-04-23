public class Fibonacci {
    public static int getValue(int element) {
        if (element == 0) {
            return 0;
        }

        if (element == 1) {
            return 1;
        }

        int result = 0;
        int position1 = 1;
        int position2 = 0;

        if (element > 1) {
            for (int i = 2; i <= element; i++) {
                result = position1 + position2;
                position2 = position1;
                position1 = result;
            }
        }

        return result;
    }
}
