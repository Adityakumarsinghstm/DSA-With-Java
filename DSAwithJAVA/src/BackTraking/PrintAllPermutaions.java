package BackTraking;

public class PrintAllPermutaions {
    public static String swap(String str, int i, int j)
    {
        char[] charArray = str.toCharArray();

        char temp = charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;

        return String.valueOf(charArray);
    }
    public static void permute(String str, int l , int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        else {
            for (int i = l; i <=r ; i++) {
                str = swap(str,l,i);
                permute(str,l+1,r);
                //Backtracking
                str = swap(str,l,i);
            }
        }
    }
    public static void main(String[] args) {

        String value = "XY";
        permute(value,0,value.length()-1);
    }
}
