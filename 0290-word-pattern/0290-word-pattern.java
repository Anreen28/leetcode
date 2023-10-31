class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a = s.split(" ");
        if(pattern.length()!=a.length)
            return false;
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<a.length; i++)
        {
            char c = pattern.charAt(i);
            String b = a[i];
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(b))
                    return false;
                }
                else
                {
                    if(map.containsValue(b))
                        return false;
                    map.put(c, b);
                }
            }
        return true;
    }
}