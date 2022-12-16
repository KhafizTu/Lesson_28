import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /** 28 / 1  */

        Integer[] num={1,4,6,9,11,8,7,6,5,12,2,3};
        Stream<Integer> number=Stream.of(num);
        Stream<Integer>stream=number.filter(x -> x % 2==0).map(x -> x*x);
        stream.max(Comparator.comparing(x->x)).stream().toList().forEach(System.out::println);


        /**  28 / 2 */

        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println("Сумма: "+list.stream().reduce(0, Integer::sum) );
        IntSummaryStatistics a  = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Арифметикалык орточо мааниси: "+Math.floor(a.getAverage() ) );
        Set<Integer> items = new HashSet<>();
        System.out.println("Окшош сандар: "+list.stream().filter(n -> !items.add(n) ).collect(Collectors.toSet() ) );

    }
}