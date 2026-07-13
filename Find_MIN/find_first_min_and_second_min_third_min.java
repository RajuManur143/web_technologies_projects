package Find_MIN;

public class find_first_min_and_second_min_third_min {
        public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,5};

        int Fmin = Integer.MAX_VALUE;
        int Smin = Integer.MAX_VALUE;
        int Tmin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Fmin) {
                Tmin = Smin;
                Smin = Fmin;
                Fmin = arr[i];
            }
            else if(arr[i] < Smin) {
                Tmin = Smin;
                Smin = arr[i];
            }
            else if (arr[i] < Tmin) {
                Tmin = arr[i];
            }
        }
        System.out.println("First maximum number is = "+Fmin);
        System.out.println("Second maximum number is = "+Smin);
        System.out.println("Third maximum number is = "+Tmin);
    }
}
