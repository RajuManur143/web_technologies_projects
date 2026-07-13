package Find_MAX;

public class find_first_max {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,5};

        int Fmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Fmax) {
                Fmax = arr[i];
            }
        }
        System.out.println("First maximum number is = "+Fmax);
    }
}
