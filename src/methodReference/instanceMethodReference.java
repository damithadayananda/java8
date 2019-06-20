package methodReference;

public class instanceMethodReference {
    final private int num =5;
    boolean isBigger(int n){
        return num>n;
    }

    public instanceMethodReference() {
        instanceMethodReference inc =new instanceMethodReference();
        IntPredicate p = inc::isBigger;
        System.out.println(p.check(4));
    }
}
