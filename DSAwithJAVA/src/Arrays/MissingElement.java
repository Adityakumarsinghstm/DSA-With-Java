package Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6, 5};
        int n = arr.length;
        //adding all natural number till n
        int sum_natural_number = ((n+1)*(n+2))/2;

        int sum = 0;
        //adding given array's element
        for (int i = 0; i < n; i++) {
            sum+= arr[i];
        }
        int missing_element = sum_natural_number - sum;
        System.out.println("The missing element is :"+ missing_element);
    }
}
//Time complexity of this problem is = O(n)
//Space complexity of this problem is = O(1)
