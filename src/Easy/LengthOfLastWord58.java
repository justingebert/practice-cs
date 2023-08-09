package Easy;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        char [] c = s.toCharArray();
        int count = 0;
        for(int i = c.length-1; i >= 0; i--){
            if(c[i] != ' ') {
                count++;
                if (i == 0 || c[i - 1] == ' ') {
                    return count;
                }
            }
        }
        return count;
    }
}
