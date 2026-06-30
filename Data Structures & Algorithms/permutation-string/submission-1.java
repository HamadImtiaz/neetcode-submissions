class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
        {
            return false;
        }
        int [] countS1= new int[26];
        int [] windowCount= new int[26];
        for(int i=0; i<s1.length(); i++)
        {
            countS1[s1.charAt(i) -'a']++;
            windowCount[s2.charAt(i) -'a']++;
        }
        if(Arrays.equals(countS1, windowCount)) return true;

        for(int r=s1.length(); r<s2.length(); r++)
        {
            windowCount[s2.charAt(r)- 'a']++;

            windowCount[s2.charAt(r-s1.length())-'a']--;

            if(Arrays.equals(countS1, windowCount)) return true;
        }
        return false;
    }
}
