package Easy;

public class Maximum69Number1323 {

    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '6'){
                s = s.substring(0,i) + "9" + s.substring(i+1,s.length());
                return Integer.parseInt(s);
            }
        }

        return Integer.parseInt(s);
    }

//    public int maximum69Number (int num) {
//
//        for(int i = 0; i < s.length(); i++){
//            if(num ){
//                s = s.substring(0,i) + "9" + s.substring(i+1,s.length());
//                return Integer.parseInt(s);
//            }
//        }
//
//        return Integer.parseInt(s);
//    }

    public static void main(String[] args) {
        Maximum69Number1323 test01 = new Maximum69Number1323();
        System.out.println(test01.maximum69Number(9669));
    }
}
