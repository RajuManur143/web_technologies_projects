class palindrome{

    public boolean isPalindrome(int[] arr) {
        
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
            
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};
        palindrome p = new palindrome();
       boolean res =  p.isPalindrome(arr);
       if (res) {
        System.out.println("is palindrome");
       }
       else {
        System.out.println("not palindrome");
       }
        
    }
}