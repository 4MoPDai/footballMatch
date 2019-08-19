public class Main {
    public static void main(String[] args)
    {
        System.out.println(calculateFootballMatch(1, 3, 1, 3));
    }

    public static int calculateFootballMatch(int scoreOne, int scoreTwo, int betOne, int betTwo)
    {
        int result = ((scoreOne == betOne) && (scoreTwo == betTwo)) ? 2 :
                (scoreOne > scoreTwo && betOne > betTwo) ||
                ((scoreOne < scoreTwo && betOne < betTwo)) ? 1 : 0;
        return result;
    }

}
