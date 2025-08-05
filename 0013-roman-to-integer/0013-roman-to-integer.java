class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int sum = 0;
        // int char[] = s.toCharArray();
        for(int i=0,j=1;j<s.length();i++,j++){
            if((m.get(s.charAt(i))>=m.get(s.charAt(j)))){
                    sum = sum + m.get(s.charAt(i));
            }else{
                sum = sum - m.get(s.charAt(i));
            }
        }
        sum+= m.get(s.charAt(s.length()-1));
        return sum;
    }
}