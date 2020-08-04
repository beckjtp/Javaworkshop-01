public class TennisGame2 implements TennisGame{
    private int player1point;
    private int player2point;

    private final String player1Name;
    private final String player2Name;
    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    public String getPoint(int playerPoint){
        if (playerPoint == 1){
            return "Fifteen";
        }
        if (playerPoint == 2){
            return "Thirty";
        }
        if (playerPoint == 0){
            return "Love";
        }
        return "Forty";
    }
    public String getScore(){
        String player1Result = "";
        String player2Result = "";
        String score = "";
        if (player1point == player2point && player1point < 4)
        {
            score= getPoint(player1point);
            score += "-All";
        }

        if (player1point == player2point && player1point >=3) {
            score = "Deuce";
        }
        if (player1point > 0 && player2point ==0 || player2point > 0 && player1point ==0 ||player1point > player2point && player1point < 4 || player2point > player1point && player2point < 4)
        {
            player1Result = getPoint(player1point);
            player2Result =  getPoint(player2point);
            score = player1Result + "-" + player2Result;
        }
        if (player1point > player2point && player2point >= 3)
        {
            score = "Advantage player1";
        }
        if (player2point > player1point && player1point >= 3)
        {
            score = "Advantage player2";
        }
        if (player1point >=4 && player2point >=0 && (player1point - player2point)>=2)
        {
            score = "Win for player1";
        }
        if (player2point >=4 && player1point >=0 && (player2point - player1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void p1Score(){
        player1point++;
    }
    public void p2score(){
        player2point++;
    }
    public void wonPoint(String player) {
        if ("player1".equals(player))
            p1Score();
        else
            p2score();
    }
}
