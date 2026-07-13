package Find_MAX;

public class Find_first_max_second_max_third_max {
        public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,5};

        int Fmax = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        int Tmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Fmax) {
                Tmax = Smax;
                Smax = Fmax;
                Fmax = arr[i];
            }
            else if(arr[i] > Smax) {
                Tmax = Smax;
                Smax = arr[i];
            }
            else if (arr[i] > Tmax) {
                Tmax = arr[i];
            }
        }
        System.out.println("First maximum number is = "+Fmax);
        System.out.println("second maximum number is = "+Smax);
        System.out.println("Third maximu number is = "+Tmax);
    }
}
