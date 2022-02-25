package ss8_clean_code.bai_tap.bai_tap_1_kata_tennis;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static final int MATCHPOINT = 4;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = LOVE;

        if (scorePlayer1 == scorePlayer2) {
            score = displayEqualScore(scorePlayer1);
        } else if (scorePlayer1 >= MATCHPOINT || scorePlayer2 >= MATCHPOINT) {
            score = displaySetPoint(scorePlayer1, scorePlayer2);
        } else {
            score = displayGetPoint(scorePlayer1, scorePlayer2, score);
        }
        return score;
    }

    private static String displayEqualScore(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private static String displayGetPoint(int scorePlayer1, int scorePlayer2, String score) {
        int tempScore;
        for (int i = FIFTEEN; i < FORTY; i++) {
            if (i == FIFTEEN) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String displaySetPoint(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
