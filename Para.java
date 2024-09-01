public class Para {
    public static void main(String[] args) {
        String str = "((())))";
        int temp = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charAt(i) == '(') {
                count++;
            }
            if (charAt(i) == ')') {
                temp++;
            }
        }
        System.out.println("count:" + count + "temp:" + temp);
        if (count == temp) {
            System.out.println("string is valid");
        } else {
            System.out.println("string is not valid");
        }
    }

    private static char charAt(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'charAt'");
    }
}
