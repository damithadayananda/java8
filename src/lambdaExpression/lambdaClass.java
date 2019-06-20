package lambdaExpression;

public class lambdaClass{
    public lambdaClass() {

    }

    public void lambdaClassTest(){
        lambdaInterface li = (name) -> {
            System.out.println("lambda expression executed:"+name);
        };
        li.draw("damitha");
    }
}
