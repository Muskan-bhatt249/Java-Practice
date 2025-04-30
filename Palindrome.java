class Solution {
    public boolean Palindrome(int x) {
        int original =x;
        int rev= 0;
        while (x>0){
        int rem =x%10;
        rev= rev*10+ rem;
        x = x/10;
        }
    

        
    return original==rev;
    }
}
