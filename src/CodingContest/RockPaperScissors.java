package CodingContest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {

    public List<String> getResults(List<String> lines){
        List<String> results = new ArrayList<>();
        String[] tournamentData = lines.get(0).split(" ");
        int numOfTournaments = Integer.parseInt(tournamentData[0]);

        for(int i = 1;i<=numOfTournaments;i++){
            String fighters = lines.get(i);
            String round1Winners = getRoundWinners(fighters);
            String round2Winners = getRoundWinners(round1Winners);
            results.add(round2Winners);
        }

        return results;
    }


    private String getRoundWinners(String fighters){
        StringBuilder winners = new StringBuilder();
        for (int j = 0; j < fighters.length(); j += 2) {
            char winner = fight(fighters.charAt(j), fighters.charAt(j + 1));
            winners.append(winner);
        }
        return winners.toString();
    }

    public char fight(char player1, char player2){
        if(player1 == player2){
            return player1;
        } else if (player1 == 'R' && player2 == 'S' ||
                player1 == 'S' && player2 == 'P' ||
                player1 == 'P' && player2 == 'R') {
            return player1;
        }else if( player2 == 'R' && player1 == 'S' ||
                player2 == 'S' && player1 == 'P' ||
                player2 == 'P' && player1 == 'R'){
            return player2;
        }
        return ' ';
    }


    public List<String> generateInitialParing(List<String> lines){
        List<String> results = new ArrayList<>();
        String[] tournamentData = lines.get(0).split(" ");
        int numOfTournaments = Integer.parseInt(tournamentData[0]);
        int numOfFighters = Integer.parseInt(tournamentData[1]);
        for(int i = 1;i<=numOfTournaments;i++){
            String[] fighters = lines.get(i).split(" ");
            int amountR = Integer.parseInt(fighters[0].substring(0, fighters[0].length() - 1));
            int amountP = Integer.parseInt(fighters[1].substring(0, fighters[1].length() - 1));
            int amountS = Integer.parseInt(fighters[2].substring(0, fighters[2].length() - 1));
            StringBuilder pairing = new StringBuilder();
            int totalFighters = amountR + amountP + amountS;


            while (pairing.length() < totalFighters) {
                // For every Paper, attempt to pair it with up to three Rocks
                if (amountP > 0 && amountR > 0) {
                    int rocksToPair = Math.min(amountR, 3);
                    for (int j = 0; j < rocksToPair; j++) {
                        pairing.append("R");
                        amountR--;
                    }
                    pairing.append("P");
                    amountP--;
                } else {
                    // If no more Papers or no more Rocks, add remaining Scissors
                    while (amountS > 0) {
                        pairing.append("S");
                        amountS--;
                    }
                    // Add any leftover Rocks or Papers
                    while (amountR > 0) {
                        pairing.append("R");
                        amountR--;
                    }
                    while (amountP > 0) {
                        pairing.append("P");
                        amountP--;
                    }
                }
            }

            results.add(pairing.toString());
        }
        return results;
    }

    public static void main(String[] args) {
        String inputFilePath = "src/CodingContest/files/level3/level3_2.in.txt";
        String outputFilePath = "src/CodingContest/files/level3/level3_2.out.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFilePath));

            RockPaperScissors rps1 = new RockPaperScissors();
            //List<String> results = rps1.getResults(lines);
            //Files.write(Paths.get(outputFilePath), results);
            List<String> initialPaining = rps1.generateInitialParing(lines);
            Files.write(Paths.get(outputFilePath), initialPaining);


            System.out.println("Results have been written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
