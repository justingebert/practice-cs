package Easy;

import java.util.HashMap;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }
        for(int x : map.values()){
            if(x != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anna";
        String t = "anna";
        ValidAnagram242 test = new ValidAnagram242();
        System.out.print(test.isAnagram(s,t));
    }
}
