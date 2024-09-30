class LambdaMathExample {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        System.out.println("5+3=" + operate(5, 3, add));
        System.out.println("5-3=" + operate(5, 3, subtract));
    }

    /**
     * InnerLambdaMathExample
     */
    interface MathOperation {
        int operate(int a, int b);
    }

    private static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}