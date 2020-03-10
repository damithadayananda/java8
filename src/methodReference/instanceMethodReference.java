package methodReference;

import java.util.Arrays;

public class instanceMethodReference {
    final private int num =5;
    boolean isBigger(int n){
        return num>n;
    }

    int isGreaterThanZero(int n){
        if (n>0){
            System.out.println(1);
           return 1;
        }else {
            System.out.println(0);
            return 0;
        }
    }

    public instanceMethodReference() {
//        instanceMethodReference inc =new instanceMethodReference();
//        IntPredicate p = inc::isBigger;
//        System.out.println(p.check(4));


    }
    public void instanceMethodReferenceDemo(){
        instanceMethodReference inc =new instanceMethodReference();
        Integer[] myInt = new Integer[]{
                1,
                2,
                3
        };
        Arrays.asList(myInt).forEach(inc::isBigger);
        Arrays.asList(myInt).forEach(inc::isGreaterThanZero);
    }
}
