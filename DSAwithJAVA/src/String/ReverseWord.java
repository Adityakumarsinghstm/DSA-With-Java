package String;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        String res = "";
        for (int i = ans.length; i >=0 ; i--) {
            if(ans[i].length() == 0)
            {
                continue;
            }
            if(res.length()==0){
                res += ans[i];
            }
            else {
                res += " "+ans[i];
            }
        }
        return res;
    }


    public static boolean isAnagram(String a, String b) {

        // Your code here
        if(a.length()!= b.length())
        {
            return false;
        }
        int[] freq = new int[26];
        int indexA = 0;
        int indexB = 0;
        int len = a.length();
        while (indexA < len && indexB<len){
            char charA = a.charAt(indexA);
            int freqA = charA -97;
            freq[freqA] += 1;
            char charB = b.charAt(indexB);
            int freqB = charB -97;
            freq[freqB] -= 1;

            indexA++;
            indexB++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }


    public String reverseWordsLeetCode(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int startPointer = 0;
        for (int endPointer = 0; endPointer <= len; endPointer++) {
            if(endPointer == len || arr[endPointer]==' ')
            {
                reverse(arr,startPointer,endPointer-1);
                startPointer = endPointer+1;
            }
        }
        return new String(arr);
    }
    public static void reverse(char[] arr, int startPointer, int endPointer)
    {
        while (startPointer<endPointer){
            char temp = arr[startPointer];
            arr[startPointer] = arr[endPointer];
            arr[endPointer] = temp;
            startPointer++;
            endPointer--;
        }

    }

    public String makeGood(String s) {
        //StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch :s.toCharArray())
        {
            //int len = ans.length();
            if(!stack.isEmpty() && Math.abs(stack.peek()-ch )== 32)
            {
                stack.pop();
               // ans.deleteCharAt(len-1);
            }
            else {
                stack.push(ch);
                //ans.append(ch);
            }
        }
        String ans = new String();
        while (!stack.isEmpty())
        {
            ans = stack.pop()+ans;
        }
        return ans;
    }
}
