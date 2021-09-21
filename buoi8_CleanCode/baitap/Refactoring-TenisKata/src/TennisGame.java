public class TennisGame {

    public static final int zeroPoint = 0;
    public static final int onePoint = 1;
    public static final int twoPoint = 2;
    public static final int threePoint = 3;

    public static String getScore(String player1Name, String player2Name, int player1_Score, int player2_Score) {
        String score = "";
        int tempScore=0;
        boolean isEqualScore = player1_Score == player2_Score;
        if (isEqualScore)
        {
            switch (player1_Score)
            {
                case zeroPoint:
                    score = "Love-All";
                    break;
                case onePoint:
                    score = "Fifteen-All";
                    break;
                case twoPoint:
                    score = "Thirty-All";
                    break;
                case threePoint:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (player1_Score>=4 || player2_Score>=4)
        {
            score = checkWin(player1_Score, player2_Score);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1_Score;
                else { score+="-"; tempScore = player2_Score;}
                switch(tempScore)
                {
                    case zeroPoint:
                        score+="Love";
                        break;
                    case onePoint:
                        score+="Fifteen";
                        break;
                    case twoPoint:
                        score+="Thirty";
                        break;
                    case threePoint:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String checkWin(int player1_Score, int player2_Score) {
        String score;
        int minusResult = player1_Score - player2_Score;
        if (minusResult== 1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
}
