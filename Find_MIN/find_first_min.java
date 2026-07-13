package Find_MIN;

public class find_first_min {
        public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,5};

        int Fmin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Fmin) {
                Fmin = arr[i];
            }
        }
        System.out.println("First maximum number is = "+Fmin);
    }
}
