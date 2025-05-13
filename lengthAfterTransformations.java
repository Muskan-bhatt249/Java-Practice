class Solution {
    public int lengthAfterTransformations(String s, int t) {
        
        for(int j=0;j<t;j++){
        String n="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='z'){
                n=n+"ab";
            }
            else{
                char x =(char) ('a' + (s.charAt(i) - 'a' + 1) % 26);
                n=n+ x;
            }

        }
        s=n;
        }
      return(s.length());  
    }
}
