import java.util.Arrays;
class Reverse {
    public void reverseString(char[] s) {
        int left =0;
        int right= s.length-1;
        while (left<right){
            char temp =s[left];
            s[left]= s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));


    }
}
