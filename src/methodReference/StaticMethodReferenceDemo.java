package methodReference;

/**
 * static method which has same method signature can pass as argument to function
 */
public class StaticMethodReferenceDemo {

    public boolean numCheck(IntPredicate p, int n){
        return p.check(n);
    }
    public StaticMethodReferenceDemo(){
        StaticMethodReferenceDemo smr = new StaticMethodReferenceDemo();
        System.out.println(smr.numCheck(IntPredicatorChecker::isPositive,5));
    }
}
