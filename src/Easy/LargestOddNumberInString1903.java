package Easy;

public class LargestOddNumberInString1903 {

    public String largestOddNumber(String num) {

        String ret = "";

        for(int i = num.length()-1; i>= 0; i--){
            if((num.charAt(i)) % 2 == 1){
                ret = num.substring(0,i+1);
                return ret;
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        LargestOddNumberInString1903 test01 = new LargestOddNumberInString1903();
        String s = test01.largestOddNumber("35427");
        System.out.println(s);
    }
}


