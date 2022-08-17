package Easy;

import java.util.Arrays;

public class ConstructTheRectangle492 {

    public int[] constructRectangle(int area) {

        int [] ret = new int[2];
        int halfRounded = (int) Math.sqrt(area);
        while (area%halfRounded != 0){
             halfRounded--;
        }
        ret [0] = area/halfRounded;
        ret [1] = halfRounded;

        return ret;
    }

    public static void main(String[] args) {
        ConstructTheRectangle492 test01 = new ConstructTheRectangle492();
        System.out.println(Arrays.toString(test01.constructRectangle(10)));
    }
}
