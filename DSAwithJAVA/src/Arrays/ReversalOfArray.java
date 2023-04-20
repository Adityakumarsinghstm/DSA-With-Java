package Arrays;

public class ReversalOfArray
{
    public static void main(String[] args) {
        int[] array = {1, 2, 34, 52, 13, 67};
        int n = array.length;
        for (int i =0;i<n/2;i++)
        {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1]= temp;
        }
        System.out.println("Reversed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print( +array[i]+" ");
        }
        System.out.println();
    }
}

// Time complexity of this problem is = O(n)
// Space complexity of this problem is = O(1)