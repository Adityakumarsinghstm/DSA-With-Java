package RecursionByShradha;

public class SortedCheck {
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {0,9,7,4,6};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }
}
