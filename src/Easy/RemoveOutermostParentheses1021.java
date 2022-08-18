package Easy;

public class RemoveOutermostParentheses1021 {

    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            int prev = count;
            if(c == '(') count++;
            else count --;

            if(prev == 0 && count == 1) continue;
            else if(prev == 1 && count == 0) continue;
            res.append(c);
        }

        return res.toString();
    }


    public static void main(String[] args) {
        RemoveOutermostParentheses1021 test01 = new RemoveOutermostParentheses1021();
        System.out.println(test01.removeOuterParentheses("(()())(())"));

    }
}
