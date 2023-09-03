package RecursionByShradha;

public class LastOccurence {
    public static int findLastOccur(int[] arr, int key, int idx) {
        int n = arr.length;
        if (idx == n) {
            return -1;
        }
        int isFound = findLastOccur(arr, key, idx + 1);

        if (isFound != -1) {
            return isFound;
        }
        if (arr[idx] == key) {
            return idx;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,5};
        int key = 7;
        int ans = findLastOccur(arr, key, 0);
        System.out.println(ans);
    }
}
