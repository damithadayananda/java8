package interface8;

public interface Interface1 {
    void method(String str);
    //with the introduction of default method interface can have
    //method implementation without affecting to other classes
    default void log(String str){
        isNull(str);
        System.out.println("I1 logging ::"+str);
    }
    static boolean isNull(String str){
        System.out.println("in interface");
        return str ==null;
    }
}
