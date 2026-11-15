class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = str.length() - 1;
        for(int i = 0; i < str.length(); i++)
        {
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(c1 != c2)
                return false;
            j--;
        }
        return true;
    }
}
