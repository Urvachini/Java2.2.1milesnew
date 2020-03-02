public class BonusMilesService {

    public int calculate(int cost) {
        double ticket = cost;
        int mileprice = 20;
        double bonus = ticket / mileprice;
        int result = (int) Math.floor(bonus);
        return result;
    }

}
