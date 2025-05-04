class Solution {
    public boolean StringPalindrome(String s) {
        String rev="";
        String m= s.toLowerCase();
        String n= m.replaceAll("[^a-zA-Z0-9]","");
        for(int i=n.length()-1; i>=0;i--){
            rev= rev+n.charAt(i);
        }
       return(n.equals(rev));  
    }
}
