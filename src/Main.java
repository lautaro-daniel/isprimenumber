import functions.Function;

public class Main {
    public static void main(String[] args) {

        Function function = new Function();

        function.primeNumbers();
        System.out.println(function.isPrimeNumber(2));
        System.out.println(function.isPrimeNumber(5));
    }
}