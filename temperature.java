public class temperature {
    public static void main(String args[]) {
        double calsius = 30;
        double fahrenheit = (calsius * 9 / 5) + 32;
        System.out.println("Fahrenheit:" + fahrenheit);
        double convertTocalsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("convertTocalsius:" + convertTocalsius);
    }
}
