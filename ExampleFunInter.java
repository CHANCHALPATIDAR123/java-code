@FunctionalInterface
/**
 * A
 */
interface square {
    int calculate(int x);
}

class A implements square {
    public int calculate(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int x = 10;

        square sq = (int y) -> y * y;
        System.out.println(sq.calculate(x));
    }
}
