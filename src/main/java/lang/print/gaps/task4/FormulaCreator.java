package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {

        double a = 2;
        double b = 3;

        double result = (9 * Math.sqrt(a) - 5 * b + 2 + a - 7) * ((a + b - (4 * (a * b))) / 2);

        System.out.println(result);

    }
}
