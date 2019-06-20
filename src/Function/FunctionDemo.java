package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public FunctionDemo(){
        Function<employee,String> funcEmpToString = (employee e)->{return e.getClass().getName();};

        List<employee> employees = Arrays.asList(new employee("dam",27),new employee("daya",61));

        List<String> empNameList = convertEmpListToNameList(employees,funcEmpToString);
    }
    private List<String> convertEmpListToNameList(List<employee> employees,Function<employee,String> function){
        List<String> empNameList = new ArrayList<>();
        for(employee emp:employees){
            empNameList.add(function.apply(emp));
        }
        return empNameList;
    }
}
