public class Main {
    public static void main(String[] args) {
        BonusMilesService calc = new BonusMilesService();
        int result = calc.calculate(119);
        System.out.println(result);
    }
}