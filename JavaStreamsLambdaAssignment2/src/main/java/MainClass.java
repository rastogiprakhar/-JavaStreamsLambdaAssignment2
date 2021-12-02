import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        MyLambda lambda = (l) -> l.stream().filter(MainClass::isPrime).collect(Collectors.toList());

        List<Integer> result=lambda.filterPrimeNumbers(list);
        System.out.println(result);
    }

    public static boolean isPrime(int number) {
        return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
    }

}
