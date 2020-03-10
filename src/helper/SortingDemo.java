package helper;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

public class SortingDemo {
    public SortingDemo(){
       String[] ss = new String[]{
               "a",
               "b",
               "c"
       };
       //see when we want to pass a method for sorting, we had to pass a class
       //just because of lack of lambda/anonymous function. but after java 8
       //Its possible
        Arrays.sort(ss,new Sorter());

        BiFunction<String,String,Integer> sorter = (s1,s2)->{
            if(s1.length()>s2.length()){
                return 1;
            }else if(s2.length()>s1.length()){
                return -1;
            }
            return 0;
        };

        Comparator<String> sorter2 =(s1,s2)->{
            if(s1.length()>s2.length()){
                return 1;
            }else if(s2.length()>s1.length()){
                return -1;
            }
            return 0;
        };
        //once lambda assigned to bi-function it's impossible to reassigned to comparator
        //because BiFunction<String,String,Integer> is not a subtype of Comparator<String>
        //Arrays.sort(ss,sorter);
        //but method reference can be added
        Arrays.sort(ss,sorter::apply);
        //lambda expression of functional interface comparator
        Arrays.sort(ss,sorter2);
    }
}
