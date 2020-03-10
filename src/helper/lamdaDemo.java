package helper;

import java.util.function.Function;

public class lamdaDemo {
    public void lamdaDemo(){
        log((l,v)->{
            System.out.println(l+":"+v);
        });
    }
    private void log(lambdaInterface logFunc){
        logFunc.print("INFO","TEST INFO");
    }
    private void log2(Function<String,String> function){

    }
}
