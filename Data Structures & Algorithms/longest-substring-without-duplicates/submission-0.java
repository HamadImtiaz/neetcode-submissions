class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet= new HashSet<>();
        int l=0;
        int res=0;
        for(int r=0; r<s.length(); r++)
        {
            char c=s.charAt(r);
            while(charSet.contains(c))
            {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res=Math.max(res, r-l+1);
        }
        return res;
    }
}
