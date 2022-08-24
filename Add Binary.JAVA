class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        
        int lenA=a.length() - 1, lenB=b.length() - 1, sum = 0;
        
        while (lenA >= 0 || lenB >= 0)
        {
            if (lenA >= 0) 
                sum += a.charAt(lenA) - '0';
            if (lenB >= 0) 
                sum += b.charAt(lenB) - '0';
            
            s.append(sum % 2);
            
            sum /= 2;
            
            lenB--;
            
            lenA--;
        }
        
        if (sum != 0) 
            s.append(sum);
        
        return s.reverse().toString();
        
    }
}
