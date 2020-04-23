public class NumberDoWhile {
    public static void main(String[] args) {
        double grown = 0.1;
        double[] numbers = new double[31];
        double i = 0;

        do {
            System.out.println(i);
            i += grown;

        } while (i < 3.1);
    }
}
