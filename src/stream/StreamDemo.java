package stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    /** A stream can be created stream from
     * collection
     * array
     * stream itself
     */
    List<String> names = new ArrayList<>(
            Arrays.asList("A","B","C","D")
    );
    String[] sArray = new String[]{
        "Aa",
        "Bb",
        "Cc"
    };
    List<Integer> integerList = new ArrayList<>(
            Arrays.asList(
                    1,78,5,2
            )
    );
    public StreamDemo(){
        names.stream().forEach(System.out::println);
        Stream.of(sArray).forEach(System.out::println);

        /**
         * produce infinite stream
         */
        //Stream.iterate(1,(n)->n+1).forEach(System.out::println);

        extractingAndCombiningStream();
        /**
         * reducing stream
         * stream.reduce() method can be used to terminate the stream
         */
        System.out.println(integerList.stream().reduce(Integer::sum));

        /**
         * collecting result
         */
        collectingResult();
        /**
         * parallel stream demo
         */
        parallelStreamDemo();
    }

    /**
     * extracting and combining stream
     * limit will terminate the stream at given number of elements
     * skip will ignore the given number of elements
     */
    private void extractingAndCombiningStream() {
        Stream<Integer> s1 = Stream.generate(() -> 1).limit(10);
        Stream<Integer> s2 = Stream.generate(() -> 1).limit(10);

        Stream.concat(s1, s2).limit(15).forEach((x) -> System.out.println(x + ","));
    }
    /**
     * At the end of stream prepossessing often need to collect result by
     * mapping results to array
     * using iterate method
     * using collectors
     */
    private void collectingResult(){
        Predicate<Integer> filter = (x)->{
            return x > 10;
        };
        //using toArray method
        Integer[] intArray = integerList.stream().filter(filter).toArray(Integer[]::new);
        Arrays.asList(intArray).forEach(
                System.out::println
        );
        //iterator method
        Iterator<Integer> integerIterator = integerList.stream().filter(filter).iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
        //collectors
        //collecting results to String List
        List<String> resultCollector = integerList.stream().map(Object::toString).collect(Collectors.toList());
        //joining
        String result=integerList.stream().map(Objects::toString).collect(Collectors.joining());

    }
    private void primitiveTypeStream(){
        Integer[] i = new Integer[]{1,2,3};

        IntStream intStream = IntStream.of(1,23);
    }

    /**
     * As soon as parallel() call on stream all intermediate operations in
     * stream will be executed parallel
     */
    private  void parallelStreamDemo(){
        integerList.stream().parallel().filter((x)->x>10).forEach(System.out::println);
        List<Integer> intArray = new ArrayList<>();
        //This is bad code because
        //this may generate race condition
        integerList.stream().parallel().map((x)->x*2).forEach(intArray::add);
        System.out.println(intArray);
    }
}
