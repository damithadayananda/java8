package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * simply stream is an interface which is implemented by several classes
 *
 * stream can be create using Collection,Array or by itself
 * 1)list.stream()
 * 2)Arrays.stream(arr)
 * 3)Stream.of("a","b")
 *
 * stream operation can be divide into two part intermediate and terminal
 * eg:=
 * 1) iterating
 * 2)mapping
 * 3)filtering
 * 4)matching
 * 5)reduction
 * 6)collecting
 */

public class streamClass {
    public void stream(){
        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<100;i++)myList.add(i);

        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> parallelStrem = myList.parallelStream();

        Stream<Integer> highNums = parallelStrem.filter(p ->p>90);

        highNums.forEach(p->System.out.println(p));
    }
}
