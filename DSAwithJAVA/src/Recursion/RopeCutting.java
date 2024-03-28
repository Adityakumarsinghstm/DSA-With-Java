package Recursion;

public class RopeCutting {
    static int findPieces(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        int res = Math.max(findPieces(n - a, a, b, c), findPieces(n - b, a, b, c) );
        int finalRes = Math.max(res, findPieces(n - c, a, b, c));
        if (finalRes == -1) {
            return -1;
        }
        return finalRes;
    }
    public static void main(String[] args) {
        int n=5, a = 2,b=5,c=1;
        int ans = findPieces(n, a, b, c);
        System.out.println(ans);
    }
}
