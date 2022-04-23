public class App {
    public static void main(String[] args) {
        IsOddValidator validator = new IsOddValidator();
        boolean result = validator.isOdd(11);
        boolean result2 = validator.isOdd(12);
        System.out.println(result);
        System.out.println(result2);
    }
}
