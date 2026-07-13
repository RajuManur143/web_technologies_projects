package Find_MAX;

public class find_first_max_second_max {
        public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,5};

        int Fmax = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Fmax) {
                Smax = Fmax;
                Fmax = arr[i];
            }
            else if(arr[i] > Smax) {
                Smax = arr[i];
            }
        }
        System.out.println("First maximum number is = "+Fmax);
        System.out.println("second maximum number is = "+Smax);
    }
}
