package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Optional<T> can be used to avoid nullPointerException
 * it comes with lot of in-buit function
 * isPresent
 * orElse
 * to deal with null-pointer exception
 *
 * optional has following trasformation methods
 * map
 * filter
 * flatmap
 */
public class optionalDemo {
    public optionalDemo(){
        //check whether value exist
        Optional<String> gender = Optional.of("MALE");
        System.out.println("Does optional empty:"+gender.isPresent());

        //this will produce null-pointer exception
        //System.out.println(new peopleWithOutOptional().getAge().toString());
        //but this also
        //System.out.println(new peopleWithOptional().getAge().toString());

        //ifPresent
        //pass value to given function if only value exist
        //then it's possible to avoid null pointer exception
       // new peopleWithOptional().getAge().ifPresent(System.out::println);

        //orElse
        //can be use to send default value when value
        //doesn't exist
        //System.out.println(new peopleWithOptional().getAge().orElse(1));

        trasformation();
    }
    class peopleWithOptional{
        public Optional<Integer> getAge() {
            return Optional.ofNullable(age);
        }

        public void setAge(Integer name) {
            this.age = age;
        }

        private Integer age =1;
    }
    class peopleWithOutOptional{
        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        private Integer age;
    }
    private void trasformation(){
        List<Optional<Integer>> l = new ArrayList<>();
        l.add(Optional.of(1));
        l.add(Optional.of(5));
        l.add(Optional.of(3));

        //filter
        //filter will filter out un-matching value
        //in the operation it will consider wrapped value
        l.stream().map((optional)->optional.filter((x)->x>2)).forEach(System.out::println);

        //map
        //optional map can be used to
        //map one type of optional to another
        l.stream().map((op)->op.map(Object::toString)).forEach(System.out::println);

        //flatmap
        //As stream flatmap this will moderate nested optional
        Optional<Optional<Integer>> nestedOptional = Optional.of(Optional.of(1));
        System.out.println(nestedOptional);
        System.out.println(nestedOptional.flatMap((x)->x));
    }
}
