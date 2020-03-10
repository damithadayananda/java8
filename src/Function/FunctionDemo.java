package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//util package has in-build functional interface
//common usage of its apply method is mapping one data type to another
//so advantage of util functional interface is any scenario that need mapping
//one type to another this in-build functional interface can be used
public class FunctionDemo {
    List<employee> employees = Arrays.asList(new employee("dam itha", 27), new employee("daya nanda", 61));

    public FunctionDemo() {

        Function<employee, String> funcEmpToString = (employee e) -> {
            return e.getClass().getName();
        };

        List<String> empNameList = convertEmpListToNameList(employees, funcEmpToString);
    }

    private List<String> convertEmpListToNameList(List<employee> employees, Function<employee, String> function) {
        List<String> empNameList = new ArrayList<>();
        for (employee emp : employees) {
            empNameList.add(function.apply(emp));
        }
        return empNameList;
    }

    //andThen can be used to first apply apply function and
    // then execute apply on result
    public void andThenDemo() {
        Function<employee, String> funcEmpToString = (employee e) -> {
            return e.getClass().getName();
        };
        Function<String, String> initialFunction = (String s) -> {
            return s.substring(0, 1);
        };
        List<String> s = convertEmpListToNameList(employees, funcEmpToString.andThen(initialFunction));
    }

    //compose act other way around first apply first function and
    //second given
    public void composeDemo() {
        Function<employee, String> funcEmpToString = (employee e) -> e.getClass().getName();
        Function<employee, employee> funcEmpFirstName = (employee e) -> {
            int index = e.getClass().getName().indexOf(" ");
            String firstName = e.getClass().getName().substring(0, index);
            e.setfName(firstName);
            return e;
        };
        List<String> empFirstNameList = convertEmpListToNameList(employees, funcEmpToString.compose(funcEmpFirstName));
    }

    //function identity return a function that always return int's input
    public void identityDemo() {
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(3));
    }
}
