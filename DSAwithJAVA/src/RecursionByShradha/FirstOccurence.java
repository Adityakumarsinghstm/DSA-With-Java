package RecursionByShradha;

public class FirstOccurence {
    static int findOccurence(int[] arr, int key,int idx) {
        int n = arr.length;
        if (arr[n - 1] != key) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        }
        return findOccurence(arr,key,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 7;
        int ans = findOccurence(arr, key, 0);
        System.out.println(ans);
    }
}
