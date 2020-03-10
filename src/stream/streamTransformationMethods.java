package stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class streamTransformationMethods {
    List<String> list =new ArrayList<>(Arrays.asList(
            "Aaa",
            "Aaa",
            "Bbb",
            "Ccc",
            "Dd"
    ));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(2,5,3,1,10));
    public streamTransformationMethods(){
        /**
         * stream provide some stateless stream transformation methods like
         * filter
         * map
         * flatmap
         * and some stateful transformations like
         * distict
         * sorted
         */
        //statelessTransformation();
        statefulTransformation();
    }
    private void statelessTransformation(){
        //         filter
        //filter will filter out values from
        //stream using predicate
        list.stream().filter((s)->s.toCharArray().length>2).forEach(System.out::println);
        //         map
        //map will change one value type to another using
        //given Function<>
        Function<String,Integer> function = String::length;
        list.stream().map(function).forEach(System.out::println);
        //         flatMap
        //achieve like this
        //      stream<List<string>> -> stream<string>
        //      stream<Set<Integer>> -> stream<Integer>
        //flatmap can be used
        List<List<String>> doubleList = new ArrayList<>();
        doubleList.add(list);
        doubleList.add(list);
        doubleList.add(list);
        doubleList.stream().flatMap((x)->x.stream()).forEach(System.out::println);
    }
    private void statefulTransformation(){
        //distinct will remove duplicates from given stream
        //and return stream without duplicates
        list.stream().distinct().forEach((x)->System.out.print(x+","));
        //sorted will return a sorted stream
        list2.stream().sorted((a,b)->{
            if (a>b){
                return 1;
            }else if(a.equals(b)){
                return 0;
            }else{
                return -1;
            }
        }).forEach(System.out::println);
    }
}
