
public class TapeEquilibrium {
    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(tapeEquilibrium.solution(A));
    }
    public int solution(int[] A) {
        int sum = 0;
        //sum of all elements
        for (int i : A) {
            sum += i;
        }
        //starting from the maximum possible value it could be
        int minDiff = Integer.MAX_VALUE;
        //the left side of the array
        int left = 0;
        //the right side of the array
        int right = sum;
        //the difference between the left and right sides
        for (int i : A) {
            left += i;
            right -= i;
            int diff = Math.abs(left - right);
            //if the difference is smaller than the current minimum difference
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

}

