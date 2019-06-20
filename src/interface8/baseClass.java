package interface8;

public class baseClass implements Interface1 {
    @Override
    public void method(String str) {

    }
    public boolean isNull(String str){
        System.out.println("in implemented class");
        return str==null;
    }
}
