package CodingContest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Bowling {


    public int[] calcScore(String thorws) {
        String[] parts = thorws.split(":");

        int numOfRound = Integer.parseInt(parts[0]);

        int[] throwsInt = Arrays.stream(parts[1].split(",")).mapToInt(Integer::parseInt).toArray();

        int[] scoreArr = new int[numOfRound];

        int score = 0;
        int scoreIndex = 0;

        for (int i = 0; i < numOfRound; i++) {
            if (throwsInt[scoreIndex] == 10){
                score += throwsInt[scoreIndex] + throwsInt[scoreIndex+1] + throwsInt[scoreIndex+2];
                scoreIndex++;
            }else if(throwsInt[scoreIndex] + throwsInt[scoreIndex+1] == 10){
                score += throwsInt[scoreIndex] + throwsInt[scoreIndex+1] + throwsInt[scoreIndex+2];
                scoreIndex += 2;
            }else{
                score += throwsInt[scoreIndex] + throwsInt[scoreIndex+1];
                scoreIndex += 2;
            }
            scoreArr[i] = score;
        }

        return scoreArr;
    }
        public static void main (String[]args){
            String input = "10:7,2,1,9,6,4,5,5,10,3,7,7,3,6,4,10,2,8,6";
            Bowling test01 = new Bowling();
            int [] scores = test01.calcScore(input);
            String formattedScores = Arrays.stream(scores)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(","));

            System.out.println(formattedScores);
        }

}
